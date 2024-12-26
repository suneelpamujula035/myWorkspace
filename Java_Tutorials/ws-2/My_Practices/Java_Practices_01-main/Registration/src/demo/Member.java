package demo;

public class Member {

	private String uname,upassword,uemail,uphone;

	public Member(String uname, String upassword, String uemail, String uphone) {
		super();
		this.uname = uname;
		this.upassword = upassword;
		this.uemail = uemail;
		this.uphone = uphone;
	}

	public Member() {
		super();
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getContact() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
