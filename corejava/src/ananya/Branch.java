import java.util.Scanner;
class Branch
{
	private String manager;
	private String ifsc;
	Accountt a;
	Branch(String manager)
	{
		this.manager=manager;
	}
	Branch(String manager, String ifsc)
	{
		this(manager);
		this.ifsc=ifsc;
	}
	Branch(String manager, String ifsc, Accountt a)
	{
		this(manager, ifsc);
		this.a=a;
	}
	public String getmanager()
	{
		return manager;
	}
	public void setmanager(String manager)
	{
		this.manager=manager;
	}
	public String getifsc()
	{
		return ifsc;
	}
	public void create_account(Accountt a)
	{
		if(this.a==null)
		{

		this.a=a;
			//Scanner s=new Scanner(System.in);
			//System.out.println("Enter account holder name\t"+a.getaccount_holder_name());
			//String account_holder_name=s.next();
			//System.out.println("Enter account number\t"+getaccount_no());
			//long account_no=s.nextLong();
			//System.out.println("Enter balance\t"+getbalance());
			//double balance=s.nextDouble();
			//this.a=new Accountt(account_holder_name, account_no, balance);
			//System.out.println("account created successfully");
		}
		else
		{
			System.out.println("Account already created");
		}
	}
	public void branch_attribute()
	{
		if(this.a!=null)
		{
			System.out.println(manager);
			System.out.println(ifsc);
		}
		else
		{
			System.out.println("nothing to display");
		}
	}
}
			