import java.util.Scanner;
 class Calculator 
{

    public static void main(String[] args) 
{

       	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first value:");
	int num1=s.nextInt();
	System.out.println("Enter the second value:");
	int num2=s.nextInt();

        System.out.println("Enter the operation to perform:\n");
        System.out.println("Addition:+ \n Substraction:- \n Multiplication:* \n Division:/\n");
	char operation= s.next().charAt(0);


        switch(operation)
        {
            case '+': System.out.println("The sum is:"+(num1+num2));
                break;

            case '-': System.out.println("The difference is:"+(num1-num2));
                break;

            case '*': System.out.println("The Multiplication is:"+(num1*num2));
                break;

            case '/': System.out.println("The Division is:"+(num1/num2));
                break;

       
            default: System.out.println("Not a valid number corresponding to operation");
                return;
        }

    }
}	