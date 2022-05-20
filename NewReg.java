package DataStructure;


import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
//Java program to implement
//a Simple Registration Form
//using Java Swing
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class StudentData
{
    String name;
    String sur;
    String email;
    String DOB;
    String qual;
    String adhr;
    String user;
    String pass;
    
	
	StudentData()
	{
		
	}
	StudentData(String name,String sur,String email,String DOB,
    		String qual, String adhr)
	{

		this.name = name;
		this.sur = sur;
		this.email = email;
		this.DOB = DOB;
		this.qual = qual;
		this.adhr = adhr; 
	}


    public void Student(String name,String sur,String email,String DOB,
    		String qual, String adhr)
    {
   

       
    }
    
    

    public String getqual()
    {
        return this.qual;
    }
    
    public String getadhr()
    {
        return this.adhr;
    }
   
    public String getpass()
    {
        return this.pass;
    }
    
    public String getuser(){
        return this.user;
    }
}
   
    

		
class MyFrame
extends JFrame
implements ActionListener
{

// Components of the Form
private Container c; //*

private JLabel title;

private JLabel fname;
private JTextField tfname;

private JLabel sname;
private JTextField tsname;

private JLabel email;
private JTextField temail;

private JLabel qual;
private JTextField tqual;

private JLabel gender;
private JRadioButton male;
private JRadioButton female;
private ButtonGroup gengp;

private JLabel dob;
private JComboBox date;
private JComboBox month;
private JComboBox year;

private JLabel adhar;
private JTextField tadhar;

private JLabel ID;
private JTextField tID;

private JLabel pass;
private JTextField tpass;

private JCheckBox term;

private JButton sub;
private JButton reset;

private JTextArea resadd;
private JLabel res;


private JTextArea tout;


private String dates[]
    = { "1", "2", "3", "4", "5",
    "6", "7", "8", "9", "10",
    "11", "12", "13", "14", "15",
    "16", "17", "18", "19", "20",
    "21", "22", "23", "24", "25",
    "26", "27", "28", "29", "30",
    "31" };
private String months[]
    = { "Jan", "feb", "Mar", "Apr",
    "May", "Jun", "July", "Aug",
    "Sup", "Oct", "Nov", "Dec" };
private String years[]
    = { "1995", "1996", "1997", "1998",
    "1999", "2000", "2001", "2002",
    "2003", "2004", "2005", "2006",
    "2007", "2008", "2009", "2010",
    "2011", "2012", "2013", "2014",
    "2015", "2016", "2017", "2018",
    "2019" };

// constructor, to initialize the components
// with default values.


public MyFrame()
{
setTitle("New Registration");
setBounds(450, 90, 900, 700);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setResizable(false);

c = getContentPane();
c.setLayout(null);

title = new JLabel("Registration Form");
title.setFont(new Font("Arial", Font.PLAIN, 30));
title.setSize(300, 30);
title.setLocation(300, 40);
c.add(title); // **

fname = new JLabel("First Name");
fname.setFont(new Font("Arial", Font.PLAIN, 20));
fname.setSize(100, 20);
fname.setLocation(100, 120);
c.add(fname);

tfname = new JTextField();
tfname.setFont(new Font("Arial", Font.PLAIN, 15));
tfname.setSize(210, 20);
tfname.setLocation(240, 120);
c.add(tfname);

sname = new JLabel("Surname");
sname.setFont(new Font("Arial", Font.PLAIN, 20));
sname.setSize(100, 20);
sname.setLocation(100, 160);
c.add(sname);

tsname = new JTextField();
tsname.setFont(new Font("Arial", Font.PLAIN, 15));
tsname.setSize(210, 20);
tsname.setLocation(240, 160);
c.add(tsname);

email = new JLabel("Email ID");
email.setFont(new Font("Arial", Font.PLAIN, 20));
email.setSize(190, 20);
email.setLocation(100, 200);
c.add(email);

temail = new JTextField();
temail.setFont(new Font("Arial", Font.PLAIN, 15));
temail.setSize(210, 20);
temail.setLocation(240, 200);
c.add(temail);

qual = new JLabel("Qualification");
qual.setFont(new Font("Arial", Font.PLAIN, 20));
qual.setSize(200, 20);
qual.setLocation(100, 240);
c.add(qual);


tqual  = new JTextField();
tqual .setFont(new Font("Arial", Font.PLAIN, 15));
tqual .setSize(210, 20);
tqual .setLocation(240, 240);
c.add(tqual );

gender = new JLabel("Gender");
gender.setFont(new Font("Arial", Font.PLAIN, 20));
gender.setSize(100, 20);
gender.setLocation(100, 280);
c.add(gender);

male = new JRadioButton("Male");
male.setFont(new Font("Arial", Font.PLAIN, 15));
male.setSelected(false);
male.setSize(75, 20);
male.setLocation(240, 280);
c.add(male);

female = new JRadioButton("Female");
female.setFont(new Font("Arial", Font.PLAIN, 15));
female.setSelected(false);
female.setSize(80, 20);
female.setLocation(320, 280);
c.add(female);

gengp = new ButtonGroup();
gengp.add(male);
gengp.add(female);

dob = new JLabel("DOB");
dob.setFont(new Font("Arial", Font.PLAIN, 20));
dob.setSize(100, 20);
dob.setLocation(100, 320);
c.add(dob);

date = new JComboBox(dates);
date.setFont(new Font("Arial", Font.PLAIN, 15));
date.setSize(50, 20);
date.setLocation(240, 320);
c.add(date);

month = new JComboBox(months);
month.setFont(new Font("Arial", Font.PLAIN, 15));
month.setSize(60, 20);
month.setLocation(290, 320);
c.add(month);

year = new JComboBox(years);
year.setFont(new Font("Arial", Font.PLAIN, 15));
year.setSize(60, 20);
year.setLocation(350, 320);
c.add(year);

adhar = new JLabel("AdharCard No.");
adhar.setFont(new Font("Arial", Font.PLAIN, 20));
adhar.setSize(200, 20);
adhar.setLocation(100, 360);
c.add(adhar);


tadhar = new JTextField();
tadhar.setFont(new Font("Arial", Font.PLAIN, 15));
tadhar.setSize(210, 20);
tadhar.setLocation(240, 360);
c.add(tadhar);



ID = new JLabel("UserName");
ID.setFont(new Font("Arial", Font.PLAIN, 20));
ID.setSize(100, 20);
ID.setLocation(100, 400);
c.add(ID);

tID = new JTextField();
tID.setFont(new Font("Arial", Font.PLAIN, 15));
tID.setSize(210, 20);
tID.setLocation(240, 400);
c.add(tID);



pass = new JLabel("Password");
pass.setFont(new Font("Arial", Font.PLAIN, 20));
pass.setSize(100, 20);
pass.setLocation(100, 440);
c.add(pass);

tpass = new JTextField();
tpass.setFont(new Font("Arial", Font.PLAIN, 15));
tpass.setSize(210, 20);
tpass.setLocation(240, 440);
c.add(tpass);

term = new JCheckBox("Accept Terms And Conditions.");
term.setFont(new Font("Arial", Font.PLAIN, 15));
term.setSize(250, 20);
term.setLocation(90, 500);
c.add(term);

sub = new JButton("Submit");
sub.setFont(new Font("Arial", Font.PLAIN, 15));
sub.setSize(100, 20);
sub.setLocation(100, 550);
sub.addActionListener(this);
c.add(sub);

reset = new JButton("Reset");
reset.setFont(new Font("Arial", Font.PLAIN, 15));
reset.setSize(100, 20);
reset.setLocation(220, 550);
reset.addActionListener(this);
c.add(reset);

tout = new JTextArea();
tout.setFont(new Font("Arial", Font.PLAIN, 15));
tout.setSize(300, 400);
tout.setLocation(500, 120);
tout.setLineWrap(true);
tout.setEditable(false);
c.add(tout);

res = new JLabel("");
res.setFont(new Font("Arial", Font.PLAIN, 20));
res.setSize(500, 25);
res.setLocation(100, 650);
c.add(res);

resadd = new JTextArea();
resadd.setFont(new Font("Arial", Font.PLAIN, 15));
resadd.setSize(200, 75);
resadd.setLocation(580, 175);
resadd.setLineWrap(true);
c.add(resadd);

setVisible(true); //**
}

LinkedList<StudentData> list=new LinkedList<StudentData>();


	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				String data1;
				String data
					= "Name : "
					+ tfname.getText() +" "+ tsname.getText()  + "\n" ;
				
				String data4 = "Email ID : " + temail.getText() + "\n";
				
				String data5 = "Qualification : " + tqual.getText() + "\n";

			
				if (male.isSelected())
					data1 = "Gender : Male"
							+ "\n";
				else
					data1 = "Gender : Female"
							+ "\n";
				
				String data2
					= "DOB : "
					+ (String)date.getSelectedItem()
					+ "/" + (String)month.getSelectedItem()
					+ "/" + (String)year.getSelectedItem()
					+ "\n";

				String data3 = "AdharCard Number : " + tadhar.getText();
				tout.setText(data + data4 +data5 +  data1 + data2 + data3);
				tout.setEditable(false);
				res.setText("Registration Successfully..");
				
			
				
		        list.add(new StudentData(tsname.getText(), tsname.getText(),temail.getText(),				
		        		data2,tqual.getText(),tadhar.getText()));
		        
		        for(StudentData sd : list) {
		        	System.out.println(sd.getadhr()+"\t"+sd.getuser());
		        	
		          //  System.out.println(data.getRecord()+"\t"+data.getName()+"\t"+data.getAge()+"\t"+data.getDob());

		        }
			}
			
			else {
				tout.setText("");
                resadd.setText("");
				res.setText("Please accept the"
							+ " terms & conditions..");
			}
			
			
			//String name,String sur,String email,String DOB,
    		// String qual, int adhr,String pass,String user
			
			
			


	        
		}

		else if (e.getSource() == reset) {
			String def = "";
			tfname.setText(def);
			tsname.setText(def);
			temail.setText(def);
			tqual.setText(def);
			tadhar.setText(def);


			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
            resadd.setText(def);

		}
	}
}

//Driver Code
public class NewReg {

	public static void main(String[] args) throws Exception
	{
		
		MyFrame r = new MyFrame();
		
		
		
				
		
		

		


	}
}

