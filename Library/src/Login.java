import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 430, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(238, 99, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel L1 = new JLabel("USERNAME");
		L1.setForeground(Color.DARK_GRAY);
		L1.setBackground(Color.LIGHT_GRAY);
		L1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		L1.setBounds(36, 87, 116, 44);
		frame.getContentPane().add(L1);
		
		JLabel L2 = new JLabel("PASSWORD");
		L2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		L2.setBounds(44, 171, 95, 35);
		frame.getContentPane().add(L2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(238, 178, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		 frame.setVisible(true);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname = textField.getText();
				   String pass = textField_1.getText();
				   if(uname.equals("Himanshu") && pass.equals("admin"))
				   {
					  
				      MyFrame f = new MyFrame(" ");
				     System.out.print("LOGIN SUCCESSFUL");
				      f.setVisible(true);
				    }
				    else
				    {
				    
				    	   System.out.print("LOGIN FAILED");
				    }
				  }
			
	
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(131, 267, 143, 66);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(131, 32, 172, 54);
		frame.getContentPane().add(lblNewLabel);
	}
}
