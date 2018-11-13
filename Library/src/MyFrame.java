
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	private int index=0;

	private LinkedList list=new LinkedList();
	private final JButton btnAddBooks = new JButton("ADD BOOKS");
	private final JButton btnDeleteBooks = new JButton("DELETE BOOKS");
	private final JButton btnListBooks = new JButton("LIST BOOKS");
	private final JLabel lblLibrary = new JLabel("LIBRARY");
	private final JButton btnSearchBooks = new JButton("ISSUE BOOKS");
	private final JButton btnReturnBooks = new JButton("RETURN BOOKS");

	public MyFrame(String s){
		super(s);
		
		Container content=getContentPane();
		Font f=new Font("TimesRoman", Font.BOLD,20);
		getContentPane().setLayout(null);
		setVisible(true);
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddBook window = new AddBook(list);
				window.frame.setVisible(true);
			}
		});
		btnAddBooks.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnAddBooks.setBounds(261, 85, 142, 29);
		
		getContentPane().add(btnAddBooks);
		btnDeleteBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 	list.delete_first();
			}
		});
		btnDeleteBooks.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnDeleteBooks.setBounds(380, 190, 161, 29);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(172, 264, 350, 167);
		getContentPane().add(textArea);
		setSize(694,562);    setVisible(true);
		
		getContentPane().add(btnDeleteBooks);
		btnListBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				list.printlist();
				String res = list.getDetails();
				textArea.setText(res);
			}
		});
		btnListBooks.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnListBooks.setBounds(160, 190, 132, 29);
		
		getContentPane().add(btnListBooks);
		lblLibrary.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblLibrary.setBounds(289, 24, 84, 29);
		
		getContentPane().add(lblLibrary);
		btnSearchBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				SearchBook window = new SearchBook(list);
				window.frame.setVisible(true);
			}
			
		});
		btnSearchBooks.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnSearchBooks.setBounds(380, 131, 132, 29);
		
		getContentPane().add(btnSearchBooks);
		btnReturnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddBook window = new AddBook(list);
				window.frame.setVisible(true);
			}
		});
		btnReturnBooks.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnReturnBooks.setBounds(160, 131, 161, 29);
		
		getContentPane().add(btnReturnBooks);
		
		
		
	}

	public void actionPerformed(ActionEvent e)
	{
		 Object target=e.getSource();
	}
}