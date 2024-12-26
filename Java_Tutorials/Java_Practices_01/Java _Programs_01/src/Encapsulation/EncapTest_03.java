package Encapsulation;

public class EncapTest_03 {
	
	private String name;
	private String rollno;
	private double percentage;
	
	public String getNAME()
	{
		return name;
	}
	public String getROLLNO()
	{
		return rollno;
	}
	public double getPERCENTAGE()
	{
		return percentage;
	}
	
	public void setNAME(String na)
	{
		name=na;
	}
	public void setROLLNO(String rn)
	{
		rollno=rn;
	}
	public void setPERCENTAGE(double per)
	{
		percentage=per;
	}

	public static void main(String[] args) {
		
		EncapTest_03 s1 = new EncapTest_03();
		s1.setNAME("Tiru");
		s1.setROLLNO("162H5A0301");
		s1.setPERCENTAGE(82.57);
	    System.out.println("Name : "+s1.getNAME());
	    System.out.println("RollNo : "+s1.getROLLNO());
	    System.out.println("Percentage : "+s1.getPERCENTAGE());
	    
	    EncapTest_03 s2 = new EncapTest_03();
		s2.setNAME("Suneel");
		s2.setROLLNO("162H5A0302");
		s2.setPERCENTAGE(78.94);
	    System.out.println("Name : "+s2.getNAME());
	    System.out.println("RollNo : "+s2.getROLLNO());
	    System.out.println("Percentage : "+s2.getPERCENTAGE());
	    
	    EncapTest_03 s3 = new EncapTest_03();
		s3.setNAME("Vishnu");
		s3.setROLLNO("162H5A0303");
		s3.setPERCENTAGE(95.36);
	    System.out.println("Name : "+s3.getNAME());
	    System.out.println("RollNo : "+s3.getROLLNO());
	    System.out.println("Percentage : "+s3.getPERCENTAGE());
	    
	    EncapTest_03 s4 = new EncapTest_03();
		s4.setNAME("Suresh");
		s4.setROLLNO("162H5A0304");
		s4.setPERCENTAGE(91.35);
	    System.out.println("Name : "+s4.getNAME());
	    System.out.println("RollNo : "+s4.getROLLNO());
	    System.out.println("Percentage : "+s4.getPERCENTAGE());
				
		
	}

}
