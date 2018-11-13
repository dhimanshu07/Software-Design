
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SearchBook{
	
	
	
	JFrame frame;
	private JLabel l0 = new JLabel("ISSUE BOOK");
	private JPanel p1= new JPanel();
	private int index=0;

	private LinkedList list=new LinkedList();
	private JTextArea textArea;
	private final JLabel lblNewLabel = new JLabel("Book Name");
	private final JTextField tBook = new JTextField();
	private final JButton btnNewButton_1 = new JButton("ISSUE");
	private final JTextField textID = new JTextField();
	private final JLabel lblId = new JLabel("ID");

	public SearchBook(LinkedList list2) {
		list = list2;
		initialize();
	}
	
 

	private void initialize() {
		textID.setBounds(133, 233, 61, 20);
		textID.setColumns(10);
		tBook.setBounds(204, 74, 86, 20);
		tBook.setColumns(10);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(253, 245, 230));
		frame.setBounds(100, 100, 687, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setBounds(280, 18, 0, 0);
		p1.setLayout(new GridLayout(6,2));
		frame.getContentPane().setLayout(null);
		l0.setBounds(144, 11, 173, 27);
		l0.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));  
		frame.getContentPane().add(l0);

		frame.getContentPane().add(p1);
		
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				String name = tBook.getText();
				String res = list.search(name);
				textArea.setText(res);
			}
		});
		btnNewButton.setBounds(326, 77, 136, 23);
		frame.getContentPane().add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(77, 153, 349, 50);
		frame.getContentPane().add(textArea);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(44, 77, 104, 27);
		
		frame.getContentPane().add(lblNewLabel);
		
		frame.getContentPane().add(tBook);
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int idno = Integer.parseInt(textID.getText());
				list.deleteNode(idno);
				
			}
		});
		btnNewButton_1.setBounds(228, 232, 89, 23);
		
		frame.getContentPane().add(btnNewButton_1);
		
		frame.getContentPane().add(textID);
		lblId.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblId.setBounds(69, 236, 41, 14);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(348, 232, 104, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		frame.getContentPane().add(lblId);
		frame.setSize(523,434);    frame.setVisible(true);}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	 
	
	 
}