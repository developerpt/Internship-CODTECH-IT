package com.springmvc.Springmvc1;

// In controller create method for returning all students.
//Make sure you have Student class with rollnumber, and name is created. 
// getter setter/ constructor should be present.

public class Students {
	String name;
	int rollnumber;

	public Students(String name, int rollnumber) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

}
