import java.util.Scanner;


public class RelationalDemo {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		 int x , y;
		  System.out.println("Enter two numbers:");
		    x= input.nextInt();
		    y= input.nextInt();
		    
		 if(x>y){
			 System.out.println(x+ "is greater than" +y);
		 }
		 
		 else if(x<y){
			 System.out.println(x+ "is less than" +y);
		 }
		 
		 else if(x==y){
			 System.out.println(x+ "is equal to" +y);
		 }
		 
		 else if(x<=y){
			 System.out.println(x+ "is less than or equals to" +y);
		 }
		 
		 else if(x>=y){
			 System.out.println(x+ "is greater than or equals to" +y);
		 }
		 
		 else if(x!=y){
			 System.out.println(x+ "is not equals to" +y);
		 }
		 
		 else{
			 System.out.println("Error");
		 }

	}

}
