package demo.project.feb18.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
@Id
int id;
@Column(name="first_name")
String firstName;
@Column(name="middle_name")
String middleName;
@Column(name="last_name")
String lastName;
@Column(name="phone_no")
long phoneNo;

public Author()
{
}

public Author(int id, String firstName, String middleName, String lastName, long phoneNo) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.phoneNo = phoneNo;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public long getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}

@Override
public String toString() {
	return "Author [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
			+ ", phoneNo=" + phoneNo + "]";
}

}
