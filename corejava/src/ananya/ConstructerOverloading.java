package ananya;

public class ConstructerOverloading {

	int usn;
	String name;
	String clgName;
	
	public ConstructerOverloading(int usn, String name, String clgName) {
		super();
		this.usn = usn;
		this.name = name;
		this.clgName = clgName;
	}
	public ConstructerOverloading(int usn, String name) {
		super();
		this.usn = usn;
		this.name = name;
	}
	public ConstructerOverloading(int usn) {
		super();
		this.usn = usn;
	}
	public ConstructerOverloading() {
		super();
	}
	
	
	
}
