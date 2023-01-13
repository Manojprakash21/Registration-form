package entities;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class formdata {
 @Id
	private int personid;
 private String FirstName;
 private String LastName;
 private String personMail;
 private String phone;
 private String lookingProfile;
 private String PersonMsg;
 

public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getPersonid() {
	return personid;
}
public void setPersonid(int personid) {
	this.personid = personid;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getPersonMail() {
	return personMail;
}
public void setPersonMail(String personMail) {
	this.personMail = personMail;
}
public String getLookingProfile() {
	return lookingProfile;
}
public void setLookingProfile(String lookingProfile) {
	this.lookingProfile = lookingProfile;
}
public String getPersonMsg() {
	return PersonMsg;
}
public void setPersonMsg(String personMsg) {
	PersonMsg = personMsg;
}

public formdata(String firstName, String lastName, String personMail,String phone, String lookingProfile,
		String personMsg) {
	super();
	this.personid = new Random().nextInt(0,1000);
	FirstName = firstName;
	LastName = lastName;
	this.personMail = personMail;
	this.lookingProfile = lookingProfile;
	PersonMsg = personMsg;
	this.phone = phone;
}
public formdata() {
	super();
	// TODO Auto-generated constructor stub
}
 
	
}
