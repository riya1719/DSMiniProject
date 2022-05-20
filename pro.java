package OperatingSystem;

import java.awt.Container;
       
import java.util.LinkedList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

        class Login2
        extends JFrame
        implements ActionListener
        {

        // Components of the Form
        private Container c; //*

        private JLabel title;

        private JLabel ID;
        private JTextField tID;

        private JLabel pass;
        private JTextField tpass;


        private JButton ok;
        private JButton reset;

        private JTextArea resadd;
        private JLabel res;


        public Login2()
        {
            setTitle("Exam Login");
            setBounds(450, 90, 600, 420);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);

            c = getContentPane();
            c.setLayout(null);

            title = new JLabel("Student Login");
            title.setFont(new Font("Arial", Font.PLAIN, 30));
            title.setSize(300, 60);
            title.setLocation(210, 30);
            c.add(title); // **

            ID = new JLabel("ID");
            ID.setFont(new Font("Arial", Font.PLAIN, 20));
            ID.setSize(100, 20);
            ID.setLocation(170, 120);
            c.add(ID);

            tID = new JTextField();
            tID.setFont(new Font("Arial", Font.PLAIN, 15));
            tID.setSize(190, 20);
            tID.setLocation(270, 120);
            c.add(tID);

            pass = new JLabel("Password");
            pass.setFont(new Font("Arial", Font.PLAIN, 20));
            pass.setSize(100, 20);
            pass.setLocation(170, 170);
            c.add(pass);

            tpass = new JTextField();
            tpass.setFont(new Font("Arial", Font.PLAIN, 15));
            tpass.setSize(190, 20);
            tpass.setLocation(270, 170);
            c.add(tpass);

            ok = new JButton("OK");
            ok.setFont(new Font("Arial", Font.PLAIN, 15));
            ok.setSize(100, 20);
            ok.setLocation(170, 270);
            ok.addActionListener(this);
            c.add(ok);


            reset = new JButton("Reset");
            reset.setFont(new Font("Arial", Font.PLAIN, 15));
            reset.setSize(100, 20);
            reset.setLocation(290, 270);
            reset.addActionListener(this);
            c.add(reset);



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
            LinkedList<StudentData> list = StudentData.getList();
            
          	 Result z = new Result(tpass.getText());

           

            
            if (e.getSource() == ok)
            {
            	 for(StudentData data:list)
            	 {
                 	
                    	 
                     	if(data.getpass().equals(tpass.getText()))
                     	{
                          	 Result r = new Result();

                     	} 
                    
                 }

           	 
           	 
           	 
           	 
           	 
            }




            else if (e.getSource() == reset)
            {
                String def = "";
                tID.setText(def);
                tpass.setText(def);
            }
        }
        }


        class Result
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

        String z;
        String fname;
        String fsur;
        String fID;
        String fscore;
        
        Result (String passw)
        {

        	 z = passw;
        	            	
        }





        //constructor, to initialize the components
        //with default values.

       

            public Result()
            {
            	 LinkedList<StudentData> list = StudentData.getList();
                 
                 for(StudentData data:list)
            	 {
                 	//System.out.print(z);
                   if(data.getpass().equals("murphy@77"))
                    	
                   {
                	   fname = data.getname();
                	 fsur = data.getsur();
                	 fID = data.getID();
                	fscore = data.getscore() + "";

                   }
                 }     	
               

                setTitle("Result");
                setBounds(450, 90, 600, 420);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setResizable(false);

                c = getContentPane();
                c.setLayout(null);

                title = new JLabel("RESULT");
                title.setFont(new Font("Arial", Font.PLAIN, 30));
                title.setSize(300, 60);
                title.setLocation(230, 30);
                c.add(title); // **

                name = new JLabel("Name : ");
                name.setFont(new Font("Arial", Font.PLAIN, 17));
                name.setSize(100, 20);
                name.setLocation(230, 120);
                c.add(name);

                tname = new JLabel(fname);
                tname.setFont(new Font("Arial", Font.PLAIN, 17));
                tname.setSize(190, 20);
                tname.setLocation(315, 120);
                c.add(tname);

                sur = new JLabel("Surname :");
                sur.setFont(new Font("Arial", Font.PLAIN, 17));
                sur.setSize(100, 20);
                sur.setLocation(230, 150);
                c.add(sur);

                tsur = new JLabel(fsur); ////
                tsur.setFont(new Font("Arial", Font.PLAIN, 17));
                tsur.setSize(190, 20);
                tsur.setLocation(315, 150);
                c.add(tsur);

                ID = new JLabel("ID :");
                ID.setFont(new Font("Arial", Font.PLAIN, 17));
                ID.setSize(100, 20);
                ID.setLocation(230, 180);
                c.add(ID);

                tID = new JLabel(fID); ///////
                tID.setFont(new Font("Arial", Font.PLAIN, 17));
                tID.setSize(190, 20);
                tID.setLocation(315, 180);
                c.add(tID);

                score = new JLabel("Score : ");
                score.setFont(new Font("Arial", Font.PLAIN, 17));
                score.setSize(100, 20);
                score.setLocation(230, 210);
                c.add(score);

                tscore = new JLabel(fscore); ////
                tscore.setFont(new Font("Arial", Font.PLAIN, 17));
                tscore.setSize(190, 20);
                tscore.setLocation(315, 210);
                c.add(tscore);



                ok = new JButton("OK");
                ok.setFont(new Font("Arial", Font.PLAIN, 14));
                ok.setSize(100, 20);
                ok.setLocation(230, 290);
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

                if (e.getSource() == ok)
                {
                	 
                    Home f = new Home();
         
                }



            }
        }
        
        
 class QuesB
                extends JFrame   implements ActionListener

              {
	 

            // Components of the Form
            private Container c;
            private JLabel title;
            private JLabel name;
            private JTextField tname;
            private JLabel mno;
            private JTextField tmno;
            private JLabel gender;
            private JRadioButton A1;
            private JRadioButton B1;
            private JRadioButton C1;
            private JRadioButton D1;
            private JRadioButton A2;
            private JRadioButton B2;
            private JRadioButton C2;
            private JRadioButton D2;
            private JRadioButton A3;
            private JRadioButton B3;
            private JRadioButton C3;
            private JRadioButton D3;
            private JRadioButton A4;
            private JRadioButton B4;
            private JRadioButton C4;
            private JRadioButton D4;
            private JRadioButton A5;
            private JRadioButton B5;
            private JRadioButton C5;
            private JRadioButton D5;
            private JRadioButton A6;
            private JRadioButton B6;
            private JRadioButton C6;
            private JRadioButton D6;

            private JRadioButton A7;
            private JRadioButton B7;
            private JRadioButton C7;
            private JRadioButton D7;

            private JRadioButton A8;
            private JRadioButton B8;
            private JRadioButton C8;
            private JRadioButton D8;


            private ButtonGroup qugp1;
            private ButtonGroup qugp2;
            private ButtonGroup qugp3;
            private ButtonGroup qugp4;
            private ButtonGroup qugp5;
            private ButtonGroup qugp6;
            private ButtonGroup qugp7;
            private ButtonGroup qugp8;
           
            private JButton sub;
            private JButton reset;
            private JTextArea tout;
            private JLabel res;
            private JTextArea resadd;
            
            String x;
            String y;
            
            public QuesB()
            {
                setTitle("Examination");
                setBounds(300, 0, 1200, 900);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setResizable(false);

                c = getContentPane();
                c.setLayout(null);

                title = new JLabel("Question Bank");
                title.setFont(new Font("Arial", Font.PLAIN, 30));
                title.setSize(300, 30);
                title.setLocation(450, 10);
                c.add(title);

                name = new JLabel("Q1.What is the size of float and double in java?");
                name.setFont(new Font("Arial", Font.PLAIN, 17));
                name.setSize(1000, 20);
                name.setLocation(100, 70);
                c.add(name);


                    A1 = new JRadioButton("A)  64 and 32");
                    A1.setFont(new Font("Arial", Font.PLAIN, 13));
                    A1.setSize(140, 20);
                    A1.setLocation(120, 100);
                    A1.setSelected(false);
                    c.add(A1);

                    B1 = new JRadioButton("B)  32 and 64");
                    B1.setFont(new Font("Arial", Font.PLAIN, 13));
                    B1.setSize(140, 20);
                    B1.setLocation(350, 100);
                    B1.setSelected(false);
                    c.add(B1);

                    C1 = new JRadioButton("C)  32 and 32");
                    C1.setFont(new Font("Arial", Font.PLAIN, 13));
                    C1.setSize(140, 20);
                    C1.setLocation(580, 100);
                    C1.setSelected(false);
                    c.add(C1);

                    D1 = new JRadioButton("D)  64 and 64");
                    D1.setFont(new Font("Arial", Font.PLAIN, 13));
                    D1.setSize(140, 20);
                    D1.setLocation(800, 100);
                    D1.setSelected(false);
                    c.add(D1);

//                -------------------------------------------------------------------------------------------------------

                name = new JLabel("Q2.\n" +"Who invented Java Programming?");
                name.setFont(new Font("Arial", Font.PLAIN, 17));
                name.setSize(1000, 20);
                name.setLocation(100, 140);
                c.add(name);


                A2 = new JRadioButton("A)  Guido van Rossum");
                A2.setFont(new Font("Arial", Font.PLAIN, 13));
                A2.setSelected(true);
                A2.setSize(200, 20);
                A2.setLocation(120, 170);
                A2.setSelected(false);
                c.add(A2);

                B2 = new JRadioButton("B)   Dennis Ritchie");
                B2.setFont(new Font("Arial", Font.PLAIN, 13));
                B2.setSelected(true);
                B2.setSize(200, 20);
                B2.setLocation(350, 170);
                B2.setSelected(false);
                c.add(B2);

                C2 = new JRadioButton("C)  James Gosling");
                C2.setFont(new Font("Arial", Font.PLAIN, 13));
                C2.setSelected(true);
                C2.setSize(200, 20);
                C2.setLocation(580, 170);
                C2.setSelected(false);
                c.add(C2);

                D2 = new JRadioButton("D)   Bjarne Stroustrup");
                D2.setFont(new Font("Arial", Font.PLAIN, 13));
                D2.setSelected(true);
                D2.setSize(200, 20);
                D2.setLocation(800, 170);
                D2.setSelected(false);
                c.add(D2);
        //-------------------------------------------------------------------------------------------------------
                name = new JLabel("Q3.Which one of the following is not a Java feature?");
                name.setFont(new Font("Arial", Font.PLAIN, 17));
                name.setSize(1000, 20);
                name.setLocation(100, 210);
                c.add(name);


                A3 = new JRadioButton("A)  Object-oriented");
                A3.setFont(new Font("Arial", Font.PLAIN, 13));
                A3.setSelected(true);
                A3.setSize(200, 20);
                A3.setLocation(120, 240);
                A3.setSelected(false);
                c.add(A3);

                B3 = new JRadioButton("B)  Use of pointers");
               B3.setFont(new Font("Arial", Font.PLAIN, 13));
               B3.setSelected(true);
               B3.setSize(200, 20);
               B3.setLocation(350, 240);
               B3.setSelected(false);
                c.add(B3);

                C3 = new JRadioButton("C)  Portable");
                C3.setFont(new Font("Arial", Font.PLAIN, 13));
                C3.setSelected(true);
                C3.setSize(200, 20);
                C3.setLocation(580, 240);
                C3.setSelected(false);
                c.add(C3);

                D3 = new JRadioButton("D)  Dynamic and Extensible");
                D3.setFont(new Font("Arial", Font.PLAIN, 13));
                D3.setSelected(true);
                D3.setSize(200, 20);
                D3.setLocation(800, 240);
                D3.setSelected(false);
                c.add(D3);
        //------------------------------------------------------------------------------------------------
                name = new JLabel("Q4.What is the extension of java code files?");
                name.setFont(new Font("Arial", Font.PLAIN, 17));
                name.setSize(1000, 20);
                name.setLocation(100, 270);
                c.add(name);


                A4 = new JRadioButton("A)  .js");
                A4.setFont(new Font("Arial", Font.PLAIN, 13));
                A4.setSelected(true);
                A4.setSize(200, 20);
                A4.setLocation(120, 300);
                A4.setSelected(false);
                c.add(A4);

                B4 = new JRadioButton("B)  .txt");
                B4.setFont(new Font("Arial", Font.PLAIN, 13));
                B4.setSelected(true);
                B4.setSize(200, 20);
                B4.setLocation(350, 300);
                B4.setSelected(false);
                c.add(B4);

                C4 = new JRadioButton("C)  .class");
                C4.setFont(new Font("Arial", Font.PLAIN, 13));
                C4.setSelected(true);
                C4.setSize(200, 20);
                C4.setLocation(580, 300);
                C4.setSelected(false);
                c.add(C4);

                D4 = new JRadioButton("D)  .java");
                D4.setFont(new Font("Arial", Font.PLAIN, 13));
                D4.setSelected(true);
                D4.setSize(200, 20);
                D4.setLocation(800, 300);
                D4.setSelected(false);
                c.add(D4);
        //--------------------------------------------------------------------------------------------------------------
                name = new JLabel("Q5.Which of these are selection statements in Java?");
                name.setFont(new Font("Arial", Font.PLAIN, 17));
                name.setSize(1000, 20);
                name.setLocation(100, 340);
                c.add(name);


                A5 = new JRadioButton("A)  break");
                A5.setFont(new Font("Arial", Font.PLAIN, 13));
                A5.setSelected(true);
                A5.setSize(200, 20);
                A5.setLocation(120, 370);
                A5.setSelected(false);
                c.add(A5);

                B5 = new JRadioButton("B)  continue");
                B5.setFont(new Font("Arial", Font.PLAIN, 13));
                B5.setSelected(true);
                B5.setSize(200, 20);
                B5.setLocation(350, 370);
                B5.setSelected(false);
                c.add(B5);

                C5 = new JRadioButton("C)  for()");
                C5.setFont(new Font("Arial", Font.PLAIN, 13));
                C5.setSelected(true);
                C5.setSize(200, 20);
                C5.setLocation(580, 370);
                C5.setSelected(false);
                c.add(C5);

                D5 = new JRadioButton("D)  if()");
                D5.setFont(new Font("Arial", Font.PLAIN, 13));
                D5.setSelected(true);
                D5.setSize(200, 20);
                D5.setLocation(800, 370);
                D5.setSelected(false);
                c.add(D5);
                
        //---------------------------------------------------------------------------------------------------------------------

                name = new JLabel("Q6. Which of the following is a superclass of every class in Java?");
                name.setFont(new Font("Arial", Font.PLAIN, 17));
                name.setSize(1000, 20);
                name.setLocation(100, 410);
                c.add(name);


                A6 = new JRadioButton("A)  ArrayList");
                A6.setFont(new Font("Arial", Font.PLAIN, 13));
                A6.setSelected(true);
                A6.setSize(200, 20);
                A6.setLocation(120, 440);
                A6.setSelected(false);
                c.add(A6);

                B6 = new JRadioButton("B)  Abstract class");
                B6.setFont(new Font("Arial", Font.PLAIN, 13));
                B6.setSelected(true);
                B6.setSize(200, 20);
                B6.setLocation(350, 440);
                B6.setSelected(false);
                c.add(B6);

                C6 = new JRadioButton("C)  Object class");
                C6.setFont(new Font("Arial", Font.PLAIN, 13));
                C6.setSelected(true);
                C6.setSize(200, 20);
                C6.setLocation(580, 440);
                C6.setSelected(false);
                c.add(C6);

                D6 = new JRadioButton("D)  String");
                D6.setFont(new Font("Arial", Font.PLAIN, 13));
                D6.setSelected(true);
                D6.setSize(200, 20);
                D6.setLocation(800, 440);
                D6.setSelected(false);
                c.add(D6);
        //----------------------------------------------------------------------------------------------------------------
                name = new JLabel("Q7.Which of these packages contains the exception Stack Overflow in Java?");
                name.setFont(new Font("Arial", Font.PLAIN, 17));
                name.setSize(1000, 20);
                name.setLocation(100, 480);
                c.add(name);


                A7 = new JRadioButton("A)  java.io");
                A7.setFont(new Font("Arial", Font.PLAIN, 13));
                A7.setSelected(true);
                A7.setSize(200, 20);
                A7.setLocation(120, 510);
                A7.setSelected(false);
                c.add(A7);

                B7 = new JRadioButton("B)  java.system");
                B7.setFont(new Font("Arial", Font.PLAIN, 13));
                B7.setSelected(true);
                B7.setSize(200, 20);
                B7.setLocation(350, 510);
                B7.setSelected(false);
                c.add(B7);

                C7 = new JRadioButton("C)  java.lang");
               C7.setFont(new Font("Arial", Font.PLAIN, 13));
               C7.setSelected(true);
               C7.setSize(200, 20);
               C7.setLocation(580, 510);
               C7.setSelected(false);
                c.add(C7);

                D7 = new JRadioButton("D)  java.util");
                D7.setFont(new Font("Arial", Font.PLAIN, 13));
                D7.setSelected(true);
                D7.setSize(200, 20);
                D7.setLocation(800, 510);
                D7.setSelected(false);
                c.add(D7);
        //---------------------------------------------------------------------------------------------------------
                name = new JLabel("Q8.Which of these keywords are used for the block to be examined for exceptions?");
                name.setFont(new Font("Arial", Font.PLAIN, 17));
                name.setSize(1000, 20);
                name.setLocation(100, 550);
                c.add(name);


                A8 = new JRadioButton("A)  check");
                A8.setFont(new Font("Arial", Font.PLAIN, 13));
                A8.setSelected(true);
                A8.setSize(200, 20);
                A8.setLocation(120, 580);
                A8.setSelected(false);
                c.add(A8);

                B8 = new JRadioButton("B)   throw");
                B8.setFont(new Font("Arial", Font.PLAIN, 13));
                B8.setSelected(true);
                B8.setSize(200, 20);
                B8.setLocation(350, 580);
                B8.setSelected(false);
                c.add(B8);

                C8 = new JRadioButton("C)  catch");
                C8.setFont(new Font("Arial", Font.PLAIN, 13));
               C8.setSelected(true);
               C8.setSize(200, 20);
               C8.setLocation(580, 580);
               C8.setSelected(false);
                c.add(C8);

                D8 = new JRadioButton("D)  try");
               D8.setFont(new Font("Arial", Font.PLAIN, 13));
               D8.setSelected(true);
               D8.setSize(200, 20);
               D8.setLocation(800, 580);
               D8.setSelected(false);
                c.add(D8);
        //------------------------------------------------------------------------------------------------------------
             
                qugp1 = new ButtonGroup();
                qugp1.add(A1);
                qugp1.add(B1);
                qugp1.add(C1);
                qugp1.add(D1);

                qugp2 = new ButtonGroup();
                qugp2.add(A2);
                qugp2.add(B2);
                qugp2.add(C2);
                qugp2.add(D2);

                qugp3 = new ButtonGroup();
                qugp3.add(A3);
                qugp3.add(B3);
                qugp3.add(C3);
                qugp3.add(D3);

                qugp4 = new ButtonGroup();
                qugp4.add(A4);
                qugp4.add(B4);
                qugp4.add(C4);
                qugp4.add(D4);

                qugp5 = new ButtonGroup();
                qugp5.add(A5);
                qugp5.add(B5);
                qugp5.add(C5);
                qugp5.add(D5);

                qugp6 = new ButtonGroup();
                qugp6.add(A6);
                qugp6.add(A6);
                qugp6.add(C6);
                qugp6.add(D6);

                qugp7 = new ButtonGroup();
                qugp7.add(A7);
                qugp7.add(B7);
                qugp7.add(C7);
                qugp7.add(D7);

                qugp8 = new ButtonGroup();
                qugp8.add(A8);
                qugp8.add(B8);
                qugp8.add(C8);
                qugp8.add(D8);

                sub = new JButton("Submit");
                sub.setFont(new Font("Arial", Font.PLAIN, 15));
                sub.setSize(100, 20);
                sub.setLocation(120, 650);
        		sub.addActionListener(this);

                c.add(sub);

                reset = new JButton("Reset");
                reset.setFont(new Font("Arial", Font.PLAIN, 15));
                reset.setSize(100, 20);
                reset.setLocation(270, 650);
                c.add(reset);
        		reset.addActionListener(this);
        		
                setVisible(true);
            }

            QuesB(String ID,String pass)
           {
           	 x = ID;
           	 y = pass;
           	            	
           }

            
            
            int Score (boolean Q1,boolean Q2,boolean Q3,boolean Q4,boolean Q5,boolean Q6,boolean Q7,boolean Q8)

            {
            	int count =0;
            	
            	 if (Q1)
            		 count++;
            	 if (Q2)
            		 count++;
            	 if (Q3)
                     count++;
            	 if (Q4)
                    count++;
            	 if (Q5)
                     count++;
            	 if (Q6)
                     count++;
            	 if (Q7)
            		 count++;
            	 if (Q8)
                   count++;
            	 
            	 return count;
            	 
            	
            }
            
            
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == sub)
                {
                	int score = Score (B1.isSelected(),C2.isSelected(),B3.isSelected(),D4.isSelected(),
            				D5.isSelected(),C6.isSelected(),C6.isSelected(),D8.isSelected());
                	

                    LinkedList<StudentData> list = StudentData.getList();
                  
                              	
                	for( StudentData data:list)
                    {

                        if(data.getpass().equals(x))
                        {
                        	data.setscore(score);
                        }
                    }

                	Home p = new Home();

                }

                
                

            }
        
        }

 

 class Login
         extends JFrame
         implements ActionListener
 {

     // Components of the Form
     private Container c; //*

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


     public Login()
     {
         setTitle("Exam Login");
         setBounds(450, 90, 600, 420);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setResizable(false);

         c = getContentPane();
         c.setLayout(null);

         title = new JLabel("Student Login");
         title.setFont(new Font("Arial", Font.PLAIN, 30));
         title.setSize(300, 60);
         title.setLocation(210, 30);
         c.add(title); // **

         ID = new JLabel("ID");
         ID.setFont(new Font("Arial", Font.PLAIN, 20));
         ID.setSize(100, 20);
         ID.setLocation(170, 120);
         c.add(ID);

         tID = new JTextField();
         tID.setFont(new Font("Arial", Font.PLAIN, 15));
         tID.setSize(190, 20);
         tID.setLocation(270, 120);
         c.add(tID);

         pass = new JLabel("Password");
         pass.setFont(new Font("Arial", Font.PLAIN, 20));
         pass.setSize(100, 20);
         pass.setLocation(170, 170);
         c.add(pass);

         tpass = new JTextField();
         tpass.setFont(new Font("Arial", Font.PLAIN, 15));
         tpass.setSize(190, 20);
         tpass.setLocation(270, 170);
         c.add(tpass);

         ok = new JButton("OK");
         ok.setFont(new Font("Arial", Font.PLAIN, 15));
         ok.setSize(100, 20);
         ok.setLocation(170, 270);
         ok.addActionListener(this);
         c.add(ok);


         reset = new JButton("Reset");
         reset.setFont(new Font("Arial", Font.PLAIN, 15));
         reset.setSize(100, 20);
         reset.setLocation(290, 270);
         reset.addActionListener(this);
         c.add(reset);



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
         LinkedList<StudentData> list = StudentData.getList();
         
        

         
         if (e.getSource() == ok)
         {
        	QuesB q = new QuesB(tID.getText(),tpass.getText());
        	 
        	
        	 for(StudentData data:list)
        	 {
             	
               if(data.getID().equals(tID.getText()))
                	
                 {
                	 
                 	if(data.getpass().equals(tpass.getText()))
                 	{
                		QuesB r = new QuesB();

                 	} 
                 }
             }
        	 
        	 
         }




         else if (e.getSource() == reset)
         {
             String def = "";
             tID.setText(def);
             tpass.setText(def);
         }
     }
 }


       
              //      

        
        
        class StudentData
        {
            String name;
            String sur;
            String email;
            String DOB;
            String qual;
            String adhr;
            String pass;
            String ID;
            
            int score;
      
            
        	
        	StudentData()
        	{
        		
        	}
        	
        	StudentData(String name,String sur,String email,String DOB,
            		String qual, String adhr, String ID, String pass)
        	{

        		this.name = name;
        		this.sur = sur;
        		this.email = email;
        		this.DOB = DOB;
        		this.qual = qual;
        		this.adhr = adhr;
        		this.ID = ID;
        		this.pass = pass;
        		
        	}
        	
           static LinkedList<StudentData> list=new LinkedList<StudentData>();

            
            public  void setList(LinkedList list)
            {
                this.list = list;
            }
         
            //getter
            
            public void disp()
            {
            	//System.out.println(this.name + this.sur);
            }
            
            public void setscore(int score)
            {
                this.score =  score;
            }
            
            public static LinkedList getList() 
            {
                return list;
            }
            
            public String getname()
            {
                return this.name;
            }
            
            public String getsur()
            {
                return this.sur;
            }
            
            public String getemail()
            {
                return this.email;
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
            
            public String getID()
            {
                return this.ID;
            }
            

            
            public int getscore()
            {
                return this.score;
            }
        }
           
            

        class Regis
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
            private JButton back;

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


            public Regis()
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

                back = new JButton("Back");
                back.setFont(new Font("Arial", Font.PLAIN, 15));
                back.setSize(100, 20);
                back.setLocation(220, 550);
                back.addActionListener(this);
                c.add(back);

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
                        
                        StudentData anotherClass = new StudentData();
                   	 
                        LinkedList<StudentData> list= anotherClass.getList();
                       // LinkedList<StudentData> list = StudentData.getList();
                        
                        list.add(new StudentData(tfname.getText(), tsname.getText(),temail.getText(),				
        		        		data2,tqual.getText(),tadhar.getText(), tID.getText(),tpass.getText()));
                        
        		        for(StudentData sd : list) 
        		        System.out.println(sd.getname()+"\t"+sd.getsur()+"\t"+sd.getemail()+"\t"+sd.getqual()
        		        	+sd.getadhr()+"\t"+sd.getID()+"\t"+sd.getpass()+"\t" +sd.getscore()+"\t");
        		        
                        


                    
                    }
                    else {
                        tout.setText("");
                        resadd.setText("");
                        res.setText("Please accept the"
                                + " terms & conditions..");
                    }
                   

                }

                else if (e.getSource() == back) {
                    Home f = new Home();

                    


                }
            }
        

        }
         
        
class Home extends JFrame implements ActionListener
{

    // Components of the Form
    private Container l;

    private JLabel title;


    private JButton NewReg;
    private JButton Exam;
    private JButton Result;
    private JButton Admin;



    public Home()
    {
        setTitle("Home");
        setBounds(350, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        l = getContentPane();
        l.setLayout(null);

        title= new JLabel("Online Examination Portal");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(1000, 100);
        title.setLocation(280, 30);
        l.add(title);


        NewReg = new JButton("New Registraion");
        NewReg.setFont(new Font("Arial", Font.PLAIN, 15));
        NewReg.setSize(250, 20);
        NewReg.setLocation(300, 170);
        NewReg.addActionListener(this);
        l.add(NewReg);

        Exam = new JButton("Examination");
        Exam.setFont(new Font("Arial", Font.PLAIN, 15));
        Exam.setSize(250, 20);
        Exam.setLocation(300, 220);
        Exam.addActionListener(this);
        l.add(Exam);
        
        Result = new JButton("Result");
        Result.setFont(new Font("Arial", Font.PLAIN, 15));
        Result.setSize(250, 20);
        Result.setLocation(300, 270);
        Result.addActionListener(this);
        l.add(Result);

        Admin = new JButton("Administration");
        Admin.setFont(new Font("Arial", Font.PLAIN, 15));
        Admin.setSize(250, 20);
        Admin.setLocation(300, 320);
        Admin.addActionListener(this);
        l.add(Admin);
        setVisible(true);

       

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == NewReg) {
            Regis r = new Regis();

        }

        else if (e.getSource() == Exam)

        {
            Login l = new Login();

        }
        else if (e.getSource() == Result)
        {
        	Login2 n = new Login2();

        }
        else if (e.getSource() == Admin)
        {
           // System.out.println("Admin Module:");
        	
            StudentData anotherClass = new StudentData();
          	 
            LinkedList<StudentData> list= anotherClass.getList();
            
        }

    }
}

class pro {

    public static void main(String[] args)
    {
        Home f = new Home();

    }
}