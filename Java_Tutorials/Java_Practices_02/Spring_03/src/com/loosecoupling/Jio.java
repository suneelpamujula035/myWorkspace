package com.loosecoupling;

public class Jio {

	private Service jserv;

	
	public Service getJserv() {
		return jserv;
	}


	public void setJserv(Service jserv) {
		this.jserv = jserv;
	}


	public void activateService()
	{
		jserv.service();
	}
}
