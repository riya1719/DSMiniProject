package OperatingSystem;

import java.awt.Container;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class Result2
extends JFrame
implements ActionListener
{

// Components of the Form
private Container c; //*

private JLabel title;

private JLabel name;
private JLabel tname;

private JLabel sur;
private JLabel tsur;

private JLabel ID;
private JLabel tID;

private JLabel score;
private JLabel tscore;

private JLabel rank;
private JLabel trank;


private JButton ok;

private JLabel res;



// constructor, to initialize the components
// with default values.


public Result2()
{
setTitle("Result");
setBounds(450, 90, 600, 420);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setResizable(false);

c = getContentPane();
c.setLayout(null);

title = new JLabel("RESULT");
title.setFont(new Font("Arial", Font.PLAIN, 30));
title.setSize(300, 60);
title.setLocation(210, 30);
c.add(title); // **

name = new JLabel("Name : ");
name.setFont(new Font("Arial", Font.PLAIN, 20));
name.setSize(100, 20);
name.setLocation(170, 120);
c.add(name);

tname = new JLabel("Y"); /////
tname.setFont(new Font("Arial", Font.PLAIN, 15));
tname.setSize(190, 20);
tname.setLocation(220, 120);
c.add(tname);

sur = new JLabel("Surname :");
sur.setFont(new Font("Arial", Font.PLAIN, 20));
sur.setSize(100, 20);
sur.setLocation(170, 170);
c.add(sur);

tsur = new JLabel("Y"); //// 
tsur.setFont(new Font("Arial", Font.PLAIN, 15));
tsur.setSize(190, 20);
tsur.setLocation(220, 170);
c.add(tsur);

ID = new JLabel("ID :");
ID.setFont(new Font("Arial", Font.PLAIN, 20));
ID.setSize(100, 20);
ID.setLocation(170, 220);
c.add(ID);

tID = new JLabel("Y"); ///////
tID.setFont(new Font("Arial", Font.PLAIN, 15));
tID.setSize(190, 20);
tID.setLocation(270, 220);
c.add(tID);

score = new JLabel("Score : ");
score.setFont(new Font("Arial", Font.PLAIN, 20));
score.setSize(100, 20);
score.setLocation(170, 270);
c.add(score);

tscore = new JLabel("Y"); ////
tscore.setFont(new Font("Arial", Font.PLAIN, 15));
tscore.setSize(190, 20);
tscore.setLocation(270, 270);
c.add(tscore);



ok = new JButton("OK");
ok.setFont(new Font("Arial", Font.PLAIN, 15));
ok.setSize(100, 20);
ok.setLocation(170, 320);
ok.addActionListener(this);
c.add(ok);






res = new JLabel("");
res.setFont(new Font("Arial", Font.PLAIN, 20));
res.setSize(500, 25);
res.setLocation(100, 500);
c.add(res);


setVisible(true); //**
}



// method actionPerformed()
// to get the action performed
// by the user and act accordingly
public void actionPerformed(ActionEvent e)
{
StudentData anotherClass = new StudentData();

LinkedList<StudentData> list= anotherClass.getList();

if (e.getSource() == ok)
{
}



}
}


public class Result1
{

	public static void main(String[] args) throws Exception
	{
		
		Result2 p = new Result2();

		

	}
}
