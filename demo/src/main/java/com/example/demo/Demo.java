package com.example.demo;

public class Demo {
	
	private int id;
	private String name;
	private String status;
	
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}
	
	public Demo(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
