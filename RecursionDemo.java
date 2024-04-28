import java.util.Scanner;

public class RecursionDemo {

	public static void main(String[] args) {
		int n,f;
		Scanner input = new Scanner(System.in);
		System.out.println("enter any number:");
		n=input.nextInt();
		
		f=fact(n);
		System.out.println("the factorial is:"+f);

	}
       static int fact(int n)
       {
    	   if(n<=1)
    		   return 1;
    	   else
    		   return n*fact(n-1);
       }
}







