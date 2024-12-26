package com.telusko.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Alien_Table")
//@Table(name="Alien_Table")
public class Alien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Alien_Id")
	private int aid;
	private Alien_Name aname;
	@Column(name="Alien_Color")
	private String acolor;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Alien_Name getAname() {
		return aname;
	}
	public void setAname(Alien_Name aname) {
		this.aname = aname;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", acolor=" + acolor + "]";
	}
	
	
	
}
