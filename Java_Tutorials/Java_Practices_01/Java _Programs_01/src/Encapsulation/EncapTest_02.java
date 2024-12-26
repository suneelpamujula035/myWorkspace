package Encapsulation;

public class EncapTest_02 {
	
	private String subject;
	private int percentage;
	private char grade;
	
	public String getSUBJECT()
	{
		return subject;
	}
	public int getPERCENTAGE()
	{
		return percentage;
	}
	public char getGRADE()
	{
		return grade;
	}
	
	
	public void setSUBJECT(String sub)
	{
		subject=sub;
	}
	public void setPERCENTAGE(int per)
	{
		percentage=per;
	}
	public void setGRADE(char grd)
	{
		grade=grd;
	}
	

	public static void main(String[] args) {
		
		EncapTest_02 student1 = new EncapTest_02();
		student1.setSUBJECT("TELUGU");
		student1.setPERCENTAGE(78);
		student1.setGRADE('B');
		System.out.println("Subject : "+ student1.getSUBJECT() +  "  Percentage : "+student1.getPERCENTAGE()+  "  Grade : "+student1.getGRADE());
		
		EncapTest_02 student2 = new EncapTest_02();
		student2.setSUBJECT("HINDI");
		student2.setPERCENTAGE(65);
		student2.setGRADE('C');
		System.out.println("Subject : "+ student2.getSUBJECT() +  "  Percentage : "+student2.getPERCENTAGE()+  "  Grade : "+student2.getGRADE());
		
		EncapTest_02 student3 = new EncapTest_02();
		student3.setSUBJECT("ENGLISH");
		student3.setPERCENTAGE(95);
		student3.setGRADE('A');
		System.out.println("Subject : "+ student3.getSUBJECT() +  "  Percentage : "+student3.getPERCENTAGE()+  "  Grade : "+student3.getGRADE());
				
				
				

	}

}
