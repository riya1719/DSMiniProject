package OperatingSystem;

import java.util.*;
class StudentData1
{
    String record;
    String name;
    int age;
    String dob;
    int marks;


    StudentData1(String record, String name, int age,String dob){
        this.record=record;
        this.name=name;
        this.age=age;
        this.dob=dob;
    }
    
    public void setmarks(int marks)    {
    	this.marks =marks;
    }
   
    public int getmarks(){
        return marks;
    }
    
    public String getRecord(){
        return record;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDob(){
        return dob;
    }
    public static void main(String[] args) 
    {
        LinkedList<StudentData1> list=new LinkedList<StudentData1>();
        list.add(new StudentData1("Record1","bindu",20,"20feb"));
        list.add(new StudentData1("Record2","kavya",21,"4mar"));
        list.add(new StudentData1("Record3","sandhya",22,"5apr"));
        
        //         int totalElements = myList.size();
        

        Scanner input=new Scanner(System.in);
        System.out.print("Enter record no to display: ");
        String rec=input.next();
        
        for(StudentData1 data:list)
        {
        	
            if(data.getRecord().equals(rec))
            {
            	 data.setmarks(8);
            }
        }

        for(StudentData1 data:list)
        {
        	
            if(data.getRecord().equals(rec))
            {
            System.out.println(data.getRecord()+"\t"+data.getName()+"\t"
            +data.getAge()+"\t"+data.getDob() +"\t"+ data.getmarks());
            }
        }
    }
}
