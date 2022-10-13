import java.util.Scanner;
class BranchDriver
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter manager name\t");
		String manager=s.next();
		System.out.println("Enter ifsc code");
		String ifsc=s.next();
		Branch b=new Branch(manager, ifsc);
		boolean exit=true;
		while(exit)
		{
			System.out.println("1) Create account\n 2) branch attribute\n 3) account details\n 4) exit\n");
			System.out.println("Enter your choice\t");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:	System.out.println("Enter account holder name\t");
					String account_holder_name=s.next();
					System.out.println("Enter account number\t");
					long account_no=s.nextLong();
					System.out.println("Enter balance\t");
					double balance=s.nextDouble();
					b.create_account(new Accountt(account_holder_name, account_no, balance));
					
					break;
				case 2:b.branch_attribute();
					break;
				case 3:b.a.account_details();
					break;
				case 4:exit=false;
					break;
				default:System.out.println("Enter valid input");
			}
		}
	}
}