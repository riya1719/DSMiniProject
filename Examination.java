package DataStructure;


import java.io.*;
import java.util.LinkedList;
//Java program to implement
//a Simple Registration Form
//using Java Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





class MyExam
	extends JFrame
	implements ActionListener 
	{
	
	// Components of the Form
	private Container c; //*******
	
	private JLabel title;
	
	private JLabel ID;
	private JTextField tID;
	
	private JLabel pass;
	private JTextField tpass;
	
	
	private JButton ok;
	private JButton reset;
	
    private JTextArea resadd;
    private JLabel res;

	

	// constructor, to initialize the components
	// with default values.
	
	
	public MyExam()
	{
		setTitle("Exam Login");
		setBounds(0, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Student LogIn");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 50);
		c.add(title); // ****
		
		ID = new JLabel("Name");
		ID.setFont(new Font("Arial", Font.PLAIN, 20));
		ID.setSize(100, 20);
		ID.setLocation(100, 100);
		c.add(ID);

		tID = new JTextField();
		tID.setFont(new Font("Arial", Font.PLAIN, 15));
		tID.setSize(190, 20);
		tID.setLocation(200, 100);

		pass = new JLabel("Password");
		pass.setFont(new Font("Arial", Font.PLAIN, 20));
		pass.setSize(100, 20);
		pass.setLocation(100, 150);
		c.add(pass);

		tpass = new JTextField();
		tpass.setFont(new Font("Arial", Font.PLAIN, 15));
		tpass.setSize(190, 20);
		tpass.setLocation(200, 150);
		c.add(tpass);
		
		ok = new JButton("OK");
		ok.setFont(new Font("Arial", Font.PLAIN, 15));
		ok.setSize(100, 20);
		ok.setLocation(150, 450);
		ok.addActionListener(this);
		c.add(ok);


		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);

		
		
		res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

		setVisible(true); //********
	}
	


	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == ok)
		{
			
				
	
		}

		else if (e.getSource() == reset)
		{
			String def = "";
			tID.setText(def);
			tpass.setText(def);
			


		}
	}
}

//Driver Code
public class Examination {

	public static void main(String[] args) throws Exception
	{
		
		MyExam p = new MyExam();

		


	}
}


