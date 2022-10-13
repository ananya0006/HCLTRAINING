import java.util.Scanner;
class BagDriver
{
public static void main(String[] args)
           {
Scanner sc=new Scanner(System.in);
Bag b=new Bag();
boolean exit=true;
while(exit)
	    {
System.out.println("Enter the operation to be performed\n1.AddBall\n2.isBagEmpty\n3.getRadius\n4.removeBall\n");
int ch=sc.nextInt();
switch(ch)
  		{
	case 1:b.AddBall();
		break;
	case 2:b.isBagEmpty();
		break;
	case 3:b.getRadius();
		break;
	case 4:b.removeBall();
		break;
	case 5:exit=false;
		break;
	default:System.out.println("Enter a valid no.\n");
		}
	        }
              }
 }