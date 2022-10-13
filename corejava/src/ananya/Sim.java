package ananya;

public class Sim {
private String serviceProvider;
private long simNo;
private double balance;
private String type;

public Sim() {
	super();
}

public Sim(String serviceProvider) {
	super();
	this.serviceProvider = serviceProvider;
}


public Sim(String serviceProvider, long simNo) {
	this(serviceProvider);
	this.simNo = simNo;
}

public Sim(String serviceProvider, long simNo, double balance) {
	
	this(serviceProvider,simNo);
	
	this.balance = balance;
}

public Sim(String serviceProvider, long simNo, double balance, String type) {
	this(serviceProvider,simNo,balance);
	this.type = type;
}

public String getServiceProvider() {
	return serviceProvider;
}


public long getSimNo() {
	return simNo;
}



public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public String getType() {
	return type;
}


public void details()
{
	System.out.println(serviceProvider);
	System.out.println(simNo);
	System.out.println(balance);
	System.out.println(type);
}
}
