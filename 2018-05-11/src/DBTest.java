import javax.swing.*;

public class DBTest {
	public static void main(String[] args) {
		DBManage db = new DBManage();
		db.DBSetting();

		JFrame jf = new JFrame();
		jf.setSize(800, 800); // 로그인창 만들건데 이건 사이즈 정하는거 (width, height)
		jf.setLocation(600, 100); // 창 위치 정하는거 (x, y)
		jf.setTitle("Login"); // 제목 정하는거 ("제목")

		
		JLabel jl1 = new JLabel("아이디 : "); // 라벨 첫 번째
		jl1.setSize(50, 50);
		jl1.setLocation(100, 100);
		
		JLabel jl2 = new JLabel("패스워드  : "); // 라벨 두 번째
		jl2.setSize(50, 50);
		jl2.setLocation(100, 160);

		
		JTextField jtf1 = new JTextField(); // 텍스트 입력 첫 번째
		jtf1.setSize(170, 50);
		jtf1.setLocation(170, 110);
		
		JTextField jtf2 = new JTextField(); // 텍스트 입력 두 번째
		jtf2.setSize(170, 50);
		jtf2.setLocation(170, 170);

		
		JButton jb1 = new JButton("확인"); // 버튼 첫 번째
		jb1.setSize(85, 50);
		jb1.setLocation(170, 220);
		
		JButton jb2 = new JButton("취소"); // 버튼 두 번째
		jb2.setSize(85, 50);
		jb2.setLocation(255, 220);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		
		jp.add(jl1); // jp에 추가해줌
		jp.add(jl2); // jp에 추가해줌
		jp.add(jtf1); // jp에 추가해줌
		jp.add(jtf2); // jp에 추가해줌
		jp.add(jb1); // jp에 추가해줌
		jp.add(jb2); // jp에 추가해줌
		
		jf.add(jp); // jf에 jp를 추가해줌
		
		jf.setVisible(true); // 무조건 맨 마지막에 써야함 (true) == 실행
	}
}
