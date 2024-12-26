package com.caching.DemoHib_JPA_04;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phone {

	@Id
	private int pid;
	private String pcompany;
	private String pcolor;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcompany() {
		return pcompany;
	}
	public void setPcompany(String pcompany) {
		this.pcompany = pcompany;
	}
	public String getPcolor() {
		return pcolor;
	}
	public void setPcolor(String pcolor) {
		this.pcolor = pcolor;
	}
	@Override
	public String toString() {
		return "Phone [pid=" + pid + ", pcompany=" + pcompany + ", pcolor=" + pcolor + "]";
	}
	
	
}
