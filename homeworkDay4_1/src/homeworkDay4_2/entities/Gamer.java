package homeworkDay4_2.entities;

import java.util.Date;

public class Gamer {
	private int id;
	private String name;
	private String lastName;
	private Date date;
	private String tcNo;
	
	public Gamer() {
		
	}

	public Gamer(int id, String name, String lastName, Date date, String tcNo) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.date = date;
		this.tcNo = tcNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	
}
