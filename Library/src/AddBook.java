
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AddBook{
	
	
	
	JFrame frame;
	private JLabel l0 = new JLabel("ADD BOOK DETAILS");
	private JPanel p1= new JPanel();
	int index;

	private LinkedList list=new LinkedList();
	private JTextField tID;
	private JTextField tName;
	private JTextField tAuthor;
	private JTextField tDur;
	private JTextField tNote;

	public AddBook(LinkedList list2) {
		list = list2;
		
		initialize();
	}
	
 

	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(253, 245, 230));
		frame.setBounds(100, 100, 687, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setBounds(280, 18, 0, 0);
		p1.setLayout(new GridLayout(6,2));
		frame.getContentPane().setLayout(null);
		l0.setBounds(285, 18, 261, 27);
		l0.setFont(f);  
		frame.getContentPane().add(l0);

		frame.getContentPane().add(p1);
		
		tID = new JTextField();
		tID.setEditable(false);
		tID.setBounds(409, 58, 38, 20);
		frame.getContentPane().add(tID);
		tID.setColumns(10);
		
		tName = new JTextField();
		tName.setBounds(409, 94, 86, 20);
		frame.getContentPane().add(tName);
		tName.setColumns(10);
		
		tAuthor = new JTextField();
		tAuthor.setBounds(409, 129, 86, 20);
		frame.getContentPane().add(tAuthor);
		tAuthor.setColumns(10);
		
		tDur = new JTextField();
		tDur.setBounds(409, 162, 65, 20);
		frame.getContentPane().add(tDur);
		tDur.setColumns(10);
		
		tNote = new JTextField();
		tNote.setBounds(409, 198, 149, 34);
		frame.getContentPane().add(tNote);
		tNote.setColumns(10);
		
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int id = list.count() + 1;
				int t = Integer.parseInt(tDur.getText());
				String na = tName.getText();
				String at = tAuthor.getText();
				String no = tNote.getText();
				
				list.insert(id, na, at, t, no);
				
				tName.setText("");tAuthor.setText("");
				tNote.setText(""); tDur.setText("");
				
			}
		});
		btnNewButton.setBounds(181, 293, 89, 34);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(77, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(77, 94, 105, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblAuthor.setBounds(77, 125, 70, 27);
		frame.getContentPane().add(lblAuthor);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblDuration.setBounds(77, 164, 80, 14);
		frame.getContentPane().add(lblDuration);
		
		JLabel lblNotes = new JLabel("Rules");
		lblNotes.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNotes.setBounds(77, 195, 46, 14);
		frame.getContentPane().add(lblNotes);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(380, 288, 86, 39);
		frame.getContentPane().add(btnNewButton_1);
		frame.setSize(718,507);    frame.setVisible(true);}

	public void actionPerformed(ActionEvent e) {
		
		
	}

	 
	
	 
}