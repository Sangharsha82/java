import java.util.Scanner;


public class ArithmeticDemo{
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a;
		int b;
		int add,sub, mul,div,mod, inr, dcr;
		System.out.println("Enter numbers");
		 a=input.nextInt();
		 b=input.nextInt();
		  
          add=a+b;
          sub=a-b;
          mul=a*b;
          div=a/b;
          mod=a%b;
          inr=a++;
          dcr=a--;
           System.out.println("The sum of two numbers:" + add);
           System.out.println("The diifference of two numbers:" + sub);
           System.out.println("The multiplication of two numbers:" + mul);
           System.out.println("The division of two numbers:" + div);
           System.out.println("The modulus of two numbers:" + mod);
           System.out.println("The inrcrement of two numbers:" + inr);
           System.out.println("The decerment of two numbers:" + dcr);
	}

}
