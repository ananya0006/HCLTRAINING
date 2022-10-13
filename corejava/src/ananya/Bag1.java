import java.util.Scanner;
class Bag1
{
Ball1 b;
Scanner s=new Scanner(System.in);
public void addBall()
{
System.out.println("Enter the game you want to play");
System.out.println(" 1.Basketball\n 2.Tennisball\n");
int choice=s.nextInt();
if(choice==1)
{	
this.b=new Basketball1(10);
System.out.println("Basketball is added");
}
else
{
this.b=new TennisBall1(5);
System.out.println("Tennisball is added");
}
}
public void isBagEmpty()
{
if(this.b==null)
{
System.out.println("Bag is empty");
}
else
{
System.out.println("Bag is full");
}
}
public void getRadius()
{
if(b instanceof Basketball1)
{
Basketball1 c=(Basketball1)b;
c.getRadius();
}
else
{
TennisBall1 t=(TennisBall1)b;
t.getRadius();
}
}
public void removeBall()
{
if(b instanceof Basketball1)
{
this.b=null;
System.out.println("Basketball is removed");
}
else
{
this.b=null;
System.out.println("Tennisball is removed");
}
}
}

