package hair;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import frame.CustomerDAO;
import frame.CustomerDTO;
import frame.functionImpl;

public class PetHairFrame extends JFrame implements ActionListener{
	Calendar cal = Calendar.getInstance();
	CustomerDTO dto = null;
	CustomerDAO dao = new CustomerDAO();
	int num = 0;
	String name = "";
	String petName = "";
	int kind = 0;
	int petGender = 0;
	String service = "미용";
	// 컴포넌트
	String [] dogSize = {"소형견","중형견","대형견","특수견"};
	Container container = getContentPane();
	JPanel panel_Y_M=new JPanel();
	JPanel panel_all=new JPanel();
	JPanel panel_S=new JPanel();
	JPanel panel_C_s=new JPanel();
	JPanel panel_day=new JPanel();
	JLabel ld = new JLabel("요일");
	JLabel lt = new JLabel("시간");
	JLabel lsort = new JLabel("종류");
	JLabel lsize = new JLabel("크기");
	JPanel panel_time=new JPanel();
	JPanel panel_sort=new JPanel();
	JPanel panel_size=new JPanel();
	JLabel lkind = new JLabel();
	
	Font font = new Font("휴먼편지체",Font.BOLD | Font.ITALIC, 28);
	JLabel today = new JLabel(" "+cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1) +"월 "); 
	
	String[]str_sort= {"강아지","고양이","기타"};
	JComboBox<String> combo_sort=new JComboBox<String>(str_sort);
	
	String[]str_size= {"  ~4kg","4~8kg","8~12kg","12kg~"};
	JComboBox<String> combo_size=new JComboBox<String>(str_size);

	
	// 버튼 
	JButton bre = new JButton("예약");
	JButton brevi = new JButton("변경");
	
	JComboBox<String>days = new JComboBox<>();
	JComboBox<String>times = new JComboBox<>();
	JComboBox<String>petSize = new JComboBox(dogSize);
	public PetHairFrame(CustomerDTO dto){
		this.dto = dto;
		name = dto.getName();
		petName = dto.getPetName();
		kind = dto.getKind();
		petGender = dto.getPetGender();
		service = dto.getService();
		CustomerDTO cdto = dao.selectCustomer(name);
		num = cdto.getNum();
		for(int i = 1 ; i<=31 ; i++) {
			days.addItem(String.valueOf(i)+"일");
		}

		for(int i = 10 ; i<=19 ; i++) {
			times.addItem(String.valueOf(i) + "시 ~ " + String.valueOf(i+1)+"시");
		}
		
		
		setSize(300,500);
		setTitle("예약");
		setLocation(600,300);
		//setIconImage(iconlogo.getImage());
		init();
		start();
		setVisible(true);

	}
	
	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North",panel_Y_M);
		container.add("Center",panel_all);
		container.add("South",panel_S);
		panel_S.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel_S.add(bre);
		panel_S.add(brevi);
		panel_Y_M.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel_Y_M.add(today);
		today.setFont(font);
		panel_all.setLayout(new BorderLayout());
		panel_all.add("South",panel_C_s);
		panel_C_s.setLayout(new GridLayout(2,2));
		panel_C_s.add(panel_day);
			panel_day.setLayout(new FlowLayout(FlowLayout.CENTER));
			panel_day.add(ld);
			panel_day.add(days);
			
		panel_C_s.add(panel_time);
			panel_time.setLayout(new FlowLayout(FlowLayout.CENTER));
			panel_time.add(lt);
			panel_time.add(times);
		panel_C_s.add(panel_sort);
			panel_sort.setLayout(new FlowLayout(FlowLayout.CENTER));;
			panel_sort.add(lsort);
			if(kind == 1) {
				panel_sort.add(petSize);
			}else {
				lsort.setText("종류 :");
				panel_sort.add(lkind);
				if(kind ==2) {
					lkind.setText("고양이");
				}else if(kind == 3) {
					lkind.setText("기타");
				}
			}
		panel_C_s.add(panel_size);
			panel_size.setLayout(new FlowLayout(FlowLayout.CENTER));
			panel_size.add(lsize);
			panel_size.add(combo_size);
		

		
	}

	private void start() {
		bre.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setDefaultCloseOperation(HIDE_ON_CLOSE); 
		if(e.getSource()==bre) {
			String day = (String)days.getSelectedItem();
			String time = (String)times.getSelectedItem();
			String s_kind = (String)combo_sort.getSelectedItem();
			int kind = 1;
			if(s_kind.equals("강아지"))kind = 1;
			else if(s_kind.equals("고양이"))kind = 2;
			else if(s_kind.equals("기타"))kind = 3;
			String weight = (String)combo_size.getSelectedItem();
			PetHairDTO hdto = new PetHairDTO(num,name,petName,kind,petGender,"미용",weight,day,time);
			System.out.println(hdto.toString());
		}
	}

}
