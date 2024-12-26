package Interfaces;

interface Student
{
	void subjects();
	void marks();
}
interface Circulam
{
	void sports();
	void yoga();
}
interface Competition
{
	void nationallevel();
	void statelevel();
}
public class Interface_02 implements Student,Circulam,Competition
{

       public void subjects()
       {
    	   System.out.println("6 Subjects");
       }
       public void marks()
       {
    	   System.out.println("100 Marks");
       }
       public void sports()
       {
    	   System.out.println("Cricket,Volly Ball");
       }
       public void yoga()
       {
    	   System.out.println("Daily Yoga");
       }
       public void nationallevel()
       {
    	   System.out.println("2 times");
       }
       public void statelevel()
       {
    	   System.out.println("5 times");
       }
   	public static void main(String[] args){
   		
   		Interface_02 id = new Interface_02();
   		id.subjects();
   		id.marks();
   		id.sports();
   		id.yoga();
   		id.nationallevel();
   		id.statelevel();
   		
   	}
   		
   	
   	{

	}

}
