import javax.swing.*;

public class DBTest {
	public static void main(String[] args) {
		DBManage db = new DBManage();
		db.DBSetting();

		JFrame jf = new JFrame();
		jf.setSize(800, 800); // �α���â ����ǵ� �̰� ������ ���ϴ°� (width, height)
		jf.setLocation(600, 100); // â ��ġ ���ϴ°� (x, y)
		jf.setTitle("Login"); // ���� ���ϴ°� ("����")

		
		JLabel jl1 = new JLabel("���̵� : "); // �� ù ��°
		jl1.setSize(50, 50);
		jl1.setLocation(100, 100);
		
		JLabel jl2 = new JLabel("�н�����  : "); // �� �� ��°
		jl2.setSize(50, 50);
		jl2.setLocation(100, 160);

		
		JTextField jtf1 = new JTextField(); // �ؽ�Ʈ �Է� ù ��°
		jtf1.setSize(170, 50);
		jtf1.setLocation(170, 110);
		
		JTextField jtf2 = new JTextField(); // �ؽ�Ʈ �Է� �� ��°
		jtf2.setSize(170, 50);
		jtf2.setLocation(170, 170);

		
		JButton jb1 = new JButton("Ȯ��"); // ��ư ù ��°
		jb1.setSize(85, 50);
		jb1.setLocation(170, 220);
		
		JButton jb2 = new JButton("���"); // ��ư �� ��°
		jb2.setSize(85, 50);
		jb2.setLocation(255, 220);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		
		jp.add(jl1); // jp�� �߰�����
		jp.add(jl2); // jp�� �߰�����
		jp.add(jtf1); // jp�� �߰�����
		jp.add(jtf2); // jp�� �߰�����
		jp.add(jb1); // jp�� �߰�����
		jp.add(jb2); // jp�� �߰�����
		
		jf.add(jp); // jf�� jp�� �߰�����
		
		jf.setVisible(true); // ������ �� �������� ����� (true) == ����
	}
}
