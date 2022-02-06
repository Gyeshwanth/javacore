package com.test;

public class Construapp {

	int id;
	String name;
	
	public Construapp() {
		// TODO Auto-generated constructor stub
	}
	public Construapp(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	
	public static void main(String[] args) {
		
		Construapp c = new Construapp(1, "uma");
		System.out.println(c.id+c.name);
		Construapp c1 = new Construapp();
		
		
	}

}
