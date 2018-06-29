import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToeClient extends Thread {
	private JButton[][] buttons = new JButton[3][3]; // 버튼들의 배열로 보드를 표현함
	private char me, other; // 나의 문자와 상대방 문자를 여기에 저장
	private JFrame frame; // 프레임 객체
	private JPanel panel; // 패널객체, 여기에 보드가 보여짐
	private JLabel message; // 서버로부터 오는 메세지를 보여주는 레이블
	private Socket socket; // 서버와 연결된 소켓
	private BufferedReader input; // 입력 스트림
	private PrintWriter output; // 출력 스트림
	
	public TicTacToeClient() throws UnknownHostException, IOException {
		
		socket = new Socket("localhost", 9001); // 현재는 로컬 컴퓨터에서만 실행
				
		// 소켓으로 부터 입력 스트림과 출력 스트림을 구함
		input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		output = new PrintWriter(socket.getOutputStream());
		
		// 애플리케이션의 GUI를 생성함
		// 9장의 LAB과 동일함
		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		Font font = new Font("Dialog", Font.ITALIC, 50);
		
		message = new JLabel("여기에 메세지가 표시됩니다.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(message, BorderLayout.SOUTH);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		// 패널에 3x3 격자 형식으로 버튼을 추가한다.
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				final int ii = i;
				final int jj = j;
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(font);
				// 각 버튼에 이벤트 처리기를 붙인다. 람다식을 사용!!
				buttons[i][j].addActionListener(e -> {
					buttons[ii][jj].setText("" + me);
					output.println("MOVE " + ii + " " + jj);
				});
				panel.add(buttons[i][j]);
			}
		}
		panel.repaint();
	}
	
	// 스레드 클래스에서 작업을 기술하는 메소드이다.
	public void run() {
		String response;
		
		try {
			response = input.readLine(); // 서버로 부터 첫 번째 명령어를 읽음
			
			if(response.startsWith("START")) { // START 명령어이면 경기를 시작함.
				me = response.charAt(6);
				other = (me == 'X') ? 'O' : 'X';
				message.setText("경기가 시작됩니다!!");
				frame.setTitle("현재 경기자는 " + me);
			}
			// 서버로부터 반복적으로 명령어를 읽어서 처리한다.
			while (true) {
				response = input.readLine();
				if (response.startsWith("OTHER")) { // 상대방의 수를 보드에 표시한다
					int i = Integer.parseInt(response.substring(6, 7));
					int j = Integer.parseInt(response.substring(8, 9));
					buttons[i][j].setText("" + other);
					message.setText("상대방이 두었습니다.");
				}else if (response.startsWith("PRINT")) { // 메세지를 화면에 출력한다
					message.setText(response.substring(6));
				}
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		TicTacToeClient client = new TicTacToeClient();
		client.start();
	}
}
