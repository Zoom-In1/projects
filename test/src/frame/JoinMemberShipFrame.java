package frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JoinMemberShipFrame extends JFrame implements ActionListener {
	Container container = getContentPane();
	ImageIcon icon = new ImageIcon("img/다운로드.jpg");
	String[] firstTel = { "010", "011", "016", "017", "018", "019" };
	String[] majors = {"미용","호텔"};

	// North 부분
	JPanel northPanel = new JPanel();
	JLabel title = new JLabel(" 회원가입 ");
	Font titleFont = new Font("휴먼편지체", Font.BOLD | Font.ITALIC, 28);

	// Center 부분
	JPanel centerPanel = new JPanel();
	JPanel lPanel = new JPanel();
	JPanel tPanel = new JPanel();
	//
	JPanel t1 = new JPanel();
	JPanel t2 = new JPanel();
	JPanel t3 = new JPanel();
	
	//
	JPanel birthdayPanel = new JPanel();
	JLabel lName = new JLabel("이름 : ");
	JLabel lbirthday = new JLabel("생일 : ");
	JLabel lIdentityNum = new JLabel("주민번호 : ");
	JLabel lId = new JLabel("ID : ");
	JLabel lPw = new JLabel("비밀번호 : ");
	JLabel lPwcheck = new JLabel("비밀번호 확인 : ");
	JLabel lTel = new JLabel("전화번호");
	JLabel lMajor = new JLabel("분야");
	JTextField tName = new JTextField(10);
	JComboBox<String> years = new JComboBox<>();
	JComboBox<String> month = new JComboBox<>();
	JComboBox<String> day = new JComboBox<>();
	JComboBox<String> major = new JComboBox<>(majors);
	JButton idCheck = new JButton("중복확인");
	JTextField firstNum = new JTextField(6);
	JLabel insertChar = new JLabel("-");
	JTextField secondNum = new JTextField(7);
	JTextField tId = new JTextField(10);
	JPasswordField tPw = new JPasswordField(10);
	JPasswordField tPwCheck = new JPasswordField(10);
	JComboBox tfirstTel = new JComboBox(firstTel);
	JTextField tTel1 = new JTextField(5);
	JTextField tTe12 = new JTextField(5);
	JPanel been = new JPanel();
	//
	JPanel b1 = new JPanel();
	JPanel b2 = new JPanel();
	JPanel b3 = new JPanel();
	JPanel b4 = new JPanel();
	JPanel b5 = new JPanel();
	JPanel b6 = new JPanel();
	JPanel b7 = new JPanel();
	JPanel b8 = new JPanel();
	JPanel b9 = new JPanel();
	JPanel b10 = new JPanel();
	JPanel b11 = new JPanel();
	
	
	//
	// South 부분
	JPanel southPanel = new JPanel();
	JButton ok = new JButton("확인");
	JButton cancel = new JButton("취소");
	ButtonGroup bg = new ButtonGroup();

	public JoinMemberShipFrame() {
		setSize(370, 400);
		setIconImage(icon.getImage());
		setTitle("회원가입");
		setLocation(690, 200);

		init();
		start();
		setResizable(false);
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		// North 부분
		container.add("North", northPanel);
		northPanel.add(title);
		title.setFont(titleFont);

		// Center 부분
		// -- 년도 콤보박스
		for (int i = 1900; i <= 2999; i++) {
			years.addItem(Integer.toString(i));
		}
		// -- 달 콤보박스
		for (int i = 1; i <= 12; i++) {
			month.addItem(Integer.toString(i));
		}
		// -- 일 콤보박스
		for (int i = 1; i <= 31; i++) {
			day.addItem(Integer.toString(i));
		}
		container.add("Center", centerPanel);
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add("West", lPanel);
		lPanel.setLayout(new GridLayout(9, 1));
		lPanel.add(lName);
		lPanel.add(lbirthday);
		lPanel.add(lIdentityNum);
		lPanel.add(lId);
		lPanel.add(lPw);
		lPanel.add(lPwcheck);
		lPanel.add(lTel);
		lPanel.add(lMajor);
		centerPanel.add("Center",tPanel);
		tPanel.setLayout(new GridLayout(1,3,3,3));
		tPanel.add(t1);
		tPanel.add(t2);
		tPanel.add(t3);
		t1.setLayout(new GridLayout(9,1));
		t2.setLayout(new GridLayout(9,1));
		t3.setLayout(new GridLayout(9,1));
		t1.add(tName);
		t1.add(years);
		t1.add(firstNum);
		t1.add(tId);
		t1.add(tPw);
		t1.add(tPwCheck);
		t1.add(tfirstTel);
		t1.add(major);
		
		t2.add(b1);
		t2.add(month);
		t2.add(secondNum);
		t2.add(b2);
		t2.add(b3);
		t2.add(b4);
		t2.add(tTel1);
		t2.add(b5);
		
		t3.add(b6);
		t3.add(day);
		t3.add(b7);
		t3.add(idCheck);
		t3.add(b8);
		t3.add(b9);
		t3.add(tTe12);
		t3.add(b10);
		centerPanel.add("East",b11);
		
		// South 부분
		container.add("South", southPanel);
		southPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		southPanel.add(ok);
		southPanel.add(cancel);
		bg.add(ok);
		bg.add(cancel);

	}

	private void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

}
