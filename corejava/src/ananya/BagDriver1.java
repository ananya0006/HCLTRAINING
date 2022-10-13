//BagDriver//
import java.util.Scanner;
class BagDriver1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Bag1 a=new Bag1();
boolean exit=true;
while(exit)
{
System.out.println("1.AddBall\n 2.isBagEmpty\n 3.getRadius\n 4.Remove ball\n 5.exit\n");
System.out.println("Enter your choice");
int ch=s.nextInt();
switch(ch)
{
case 1: a.addBall();
break;
case 2: a.isBagEmpty();
break;
case 3: a.getRadius();
break;
case 4: a.removeBall();
break;
case 5: exit=false;
default: System.out.println("Invalid choice");
}
}
}
}