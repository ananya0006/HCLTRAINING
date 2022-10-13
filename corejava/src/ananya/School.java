package ananya;

public class School {
	
private String name;
private  String principal;
private int noOfStudents;
private String address;



public School() {
	
}

public School(String name) {
	
	this.name = name;
}

public School(String name, String principal) {
	
	this(name);
	this.principal = principal;
}

public School(String name, String principal, int noOfStudents) {
	this(name,principal);

	this.noOfStudents = noOfStudents;
}

public School(String name, String principal, int noOfStudents, String address) {
	this(name,principal,noOfStudents);

	this.address = address;
}

public String getName() {
	return name;
}

public String getPrincipal() {
	return principal;
}
public void setPrincipal(String principal) {
	this.principal = principal;
}
public int getNoOfStudents() {
	return noOfStudents;
}
public void setNoOfStudents(int noOfStudents) {
	this.noOfStudents = noOfStudents;
}
public String getAddress() {
	return address;
}
public void details()
{
	System.out.println(name);
	System.out.println(principal);
	System.out.println(noOfStudents);
	System.out.println(address);
}
}


