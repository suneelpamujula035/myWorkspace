package Inheritance_Concepts;
class Person
{
    private String name;
    private  int age;
    
    public String getNAME()
    {
    	return name;
    }
    public int getAGE()
    {
    	return age;
    }
    public void setNAME(String na)
    {
    	name=na;
    }
    public void setAGE(int ag)
    {
    	age=ag;
    }
    
}
public class SingleInheritance extends Person
{
    private String empid;
    
    public String getEMPID()
    {
    	return empid;
    }
       public void setEMPID(String id)
    {
    	empid=id;
    }


	public static void main(String[] args) {
		
		SingleInheritance e1 = new SingleInheritance();
		e1.setNAME("Suneel");
		e1.setAGE(23);
		e1.setEMPID("162H5A0302");
		System.out.println("Name : "+e1.getNAME());
		System.out.println("Age : "+e1.getAGE());
		System.out.println("EmpId : "+e1.getEMPID());
		
		SingleInheritance e2 = new SingleInheritance();
		e2.setNAME("Pawan");
		e2.setAGE(25);
		e2.setEMPID("152H1A0340");
		System.out.println("Name : "+e2.getNAME());
		System.out.println("Age : "+e2.getAGE());
		System.out.println("EmpId : "+e2.getEMPID());




	}

}
