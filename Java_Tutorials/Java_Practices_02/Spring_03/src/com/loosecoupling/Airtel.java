package com.loosecoupling;

public class Airtel {

	private Service serv;

	public Service getServ() {
		return serv;
	}

	public void setServ(Service serv) {
		this.serv = serv;
	}
	
	public void activateService()
	{
		serv.service();
	}
	
}
