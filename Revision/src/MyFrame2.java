
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Name  Application  ");
	private JLabel l1 = new JLabel("First ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l2 = new JLabel("Surname ");
	private JTextField t2=new JTextField("0",8);
	private JButton b1=new JButton("Update First");private JTextField t3=new JTextField("0",8);
	private JButton b2=new JButton("Update Surname");private JTextField t4=new JTextField("0",8);
	private JLabel l3 = new JLabel("Spare ");
	private JTextField t5=new JTextField(" ",8);
	private JPanel p1=new JPanel();
	private JButton b5=new JButton("print Full Name");
	private JButton b6=new JButton("Update Full Name");
	private Name n =new Name("John",   "Smith");
	
	public MyFrame2(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(5,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(b1); p1.add(t3);
		p1.add(b2); p1.add(t4);
		p1.add(l3); p1.add(t5);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
        content.add(b5);content.add(b6);b5.addActionListener(this); b6.addActionListener(this);  
		refresh();
		setSize(290,270);    setVisible(true);}
	
	public void  refresh(){
	     t1.setText(""+n.readFirst());
	     t2.setText(""+n.readSurname());}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	//t5.setText("");
	 	if (target==b1){

	          		n.updateFirst(t3.getText());
	             	refresh();
	             }
	 	if (target==b2){

      		n.updateSurname(t4.getText());
         	refresh();
         }
	 	if (target==b5){

      		n.printFullName();
         }
	 	if (target==b6){

      		n.UpdateFullName(t5.getText());
      		refresh();
         }
	 }

}