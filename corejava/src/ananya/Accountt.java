class Accountt
{
	private String account_holder_name;
	private long account_no;
	private double balance;
	Accountt(String account_holder_name)
	{
		this.account_holder_name=account_holder_name;
	}
	Accountt(String account_holder_name, long account_no)
	{
		this(account_holder_name);
		this.account_no=account_no;
	}
	Accountt(String account_holder_name, long account_no, double balance)
	{
		this(account_holder_name, account_no);
		this.balance=balance;
	}
	public String getaccount_holder_name()
	{
		return account_holder_name;
	}
	public void setaccount_holder_name(String account_holder_name)
	{
		this.account_holder_name=account_holder_name;
	}
	public long getaccount_no()
	{
		return account_no;
	}
	public double getbalance()
	{
		return balance;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public void account_details()
	{
		System.out.println(account_holder_name);
		System.out.println(account_no);
		System.out.println(balance);
	}
}
