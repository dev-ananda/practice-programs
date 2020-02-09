package dev.ananda.graph.socialnetwork;

import java.util.Date;

public class User {
	private Integer userID;
	
	private String firstName;
	private String surName;
	//private String displayName;

	private String emailID;
	//private boolean emailVerified;
	
	private String password;
	private String hometown;
	
	private String dobString;
	private Date dob;
	
	private String relationship;
	private String political;
	
	private String religious;


	public User(Integer userID, String firstName) {
		super();
		this.userID = userID;
		this.firstName = firstName;
	}
	
	public Integer getUserID() {
		return userID;
	}

	public String getFirstName() {
		return firstName;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}
	
}
