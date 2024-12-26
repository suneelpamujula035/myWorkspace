package Encapsulation;

public class EncapTest_01 {
	
	private String name;
	private String idnum;
	private int age;
	
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public String getIdNum()
	{
		return idnum;
	}
	public void setAge(int newAge)
	{
		age=newAge;
	}
	public void setName(String newName)
	{
		name=newName;
	}
	public void setIdNum(String newId)
	{
		idnum=newId;
	}


	public static void main(String[] args) {
		
		EncapTest_01 encap1 = new EncapTest_01();
		encap1.setName("suneel");
		encap1.setAge(23);
		encap1.setIdNum("18895hy");
		System.out.println("Name : "+ encap1.getName() + " Age : "+ encap1.getAge()+"IdNum : "+ encap1.getIdNum());
		
		
		EncapTest_01 encap2 = new EncapTest_01();
		encap2.setName("suresh");
		encap2.setAge(23);
		encap2.setIdNum("18945sg");
		System.out.println("Name : "+ encap2.getName() + " Age : "+ encap2.getAge()+"IdNum : "+ encap2.getIdNum());

		
		EncapTest_01 encap3 = new EncapTest_01();
		encap3.setName("pawan");
		encap3.setAge(25);
		encap3.setIdNum("18645ew");
		System.out.println("Name : "+ encap3.getName() + " Age : "+ encap3.getAge()+"IdNum : "+ encap3.getIdNum());

	}

}
