import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TicTacToeServer {
	public static void main(String[] args) throws Exception {
		// ��Ʈ��ȣ 9001���� ���� ������ ��Ʈ�� ���
		ServerSocket ss = new ServerSocket(9001);
		System.out.println("Tic-Tac-Toe Server is on");
		
		// ����� 2�� ���̸� ���� ���۵�.
		// ������ �󸶵��� ���� ��������
		try {
			while(true) {
				Game game = new Game(); // ���ο� ���� ����
				
				// ����ڸ� ��Ÿ���� ��ü 2�� ����
				Player player1 = new Player(game, ss.accept(), 'X');
				Player player2 = new Player(game, ss.accept(), 'O');
				
				// ������ ������ �˸�
				player1.setOther(player2);
				player2.setOther(player1);
				
				// ����� 2���� ���̸� ���� ����
				player1.start();
				player2.start();
				System.out.println("�� ����� �����ϴ�.");
			}
		} finally {
			ss.close();
		}
	}
}


// �ϳ��� ������ ��Ÿ���� Ŭ������
class Game {
	char[][] boards = new char[3][3]; // 2���� ���� �迭�� �̿��� ���带 ��Ÿ����!
	
	public void setBoard(int i, int j, char playerMark) {
		boards[i][j] = playerMark;
	}
	
	public char getBoard(int i, int j) {
		return boards[i][j];
	}
	
	// ������ ���� ���¸� �ֿܼ� �����
	public void printBoard() {
		for(int k = 0; k < 3; k++) {
			System.out.println(" " + boards[k][0] + "| " + boards[k][1] + "| " + boards[k][2]);
			if (k != 2) {
				System.out.println("---|---|---");
			}
		}
	}
}

// �ϳ��� ����ڸ� ��Ÿ���� Ŭ������
class Player extends Thread {
	Game game; // ����ڰ� ���� ������ ����Ŵ
	Socket socket; // ���� ��⿡ ���� �� ����
	BufferedReader input; // ���Ͽ��� ���� �Է� ��Ʈ��
	PrintWriter output; // ���Ͽ��� ���� ��� ��Ʈ��
	char playerMark; // ���� ����ڰ� 'X'���� 'O'������ ��Ÿ��
	Player other; // ��� ����� ��ü
	
	public Player(Game game, Socket socket, char playerMark) {
		this.game = game;
		this.socket = socket;
		this.playerMark = playerMark;
		
		try {
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new PrintWriter(socket.getOutputStream(), true);
			output.println("START" + playerMark);
			output.println("PRINT �ٸ� ����ڸ� ��ٸ��ϴ�");
		} catch (IOException e) {
			System.out.println("������ ���������ϴ�. " + e);
		}
	}
	
	public void setOther (Player other) {
		this.other = other;
	}
	
	public void run() {
		try {
			output.println("PRINT ��� ����ڰ� ����Ǿ����ϴ�.");
			
			if (playerMark == 'X') {
				output.println("PRINT ��� �����Դϴ�.");
			}
			
			// Ŭ���̾�Ʈ�� ���� ��ɾ �޾Ƽ� ó����.
			while(true) {
				String command = input.readLine();
				
				if (command == null) {
					continue;
				}
				if (command.startsWith("MOVE")) { // MOVE ��ɾ�
					int i = Integer.parseInt(command.substring(5, 6));
					int j = Integer.parseInt(command.substring(7, 8));
					
					game.setBoard(i, j, playerMark);
					game.printBoard();
					other.output.println("OTHER " + i + " " + j);
					output.println("PRINT ��ٸ�����!");
					other.output.println("PRINT ��� ���� �Դϴ�.");
				} else if (command.startsWith("QUIT")) { // QUIT ��ɾ�
					return;
				}
			}
		} catch (IOException e) {
			System.out.println("������ ���������ϴ�." + e);
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				
			}
		}
	}
}
 