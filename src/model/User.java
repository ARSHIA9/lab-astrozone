package model;

//Type your code here
public class User{
	public String name;

	public String dob;
	public String gender;
	

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public User(String name, String gender, String dob) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		
	}
	
	
	
	


//	public User(String string, String string2, String string3) {
//		// TODO Auto-generated constructor stub
//	}
	
}