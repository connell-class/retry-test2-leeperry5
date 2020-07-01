package com.revature.tier1;

public class User {
	// Let's try declaring these in a different order to make sure that the tests still work
	private int id;
	private String role = "";
	private String lastName;
	private String firstName;
	private String username;
	private String password;
	
	public User() {
		id = 0;
		firstName = "";
		lastName = "";
		username = "";
		password = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
