import java.util.Scanner;


public class SwitchStatement {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int i;
		System.out.println("Enter a number");
          i=input.nextInt();
            if(i<0 || i>100){
            	System.out.println("Enter a valid number");
            }
            else{
            	switch(i/10){
            	case 10:
            		System.out.println("A+");
            		break;
            		
            	case 9:
            		System.out.println("A");
            		break;
            		
            	case 8:
            		System.out.println("B+");
            		break;
            		
            	case 7:
            		System.out.println("B");
            		break;
            		
            	case 6:
            		System.out.println("C+");
            		break;
            		
            	default :
            		System.out.println("Fail");
            	}
            }
	}

}
