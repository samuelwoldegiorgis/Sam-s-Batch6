package com.syntax.class211;

public class Doctor {

	int doctorId;
	String name;

	public Doctor(String name, int doctorId) {
		this.name = name;
		this.doctorId = doctorId;
	}
}

class Dentist extends Doctor {

	Dentist(String name, int doctorId) {
		// compiler will try to make call to parent class constructor super();
		super(name, doctorId);

	String cert;

	Dentist(String name, int doctorId, String cert) {
		super.name = name;
		super.doctorId = doctorId;
		this.cert = cert;
	  }
	
	}
}
