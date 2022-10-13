class NestedIf
{
	public static void main(String[] args)
	{
		int a=18, b=52, c=21;

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");		
			}
			else
			{
				System.out.println("c is greater");
			}

		}

		else
		{
			if(b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
	
		}
		
	}

}
