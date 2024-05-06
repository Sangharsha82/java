import java.util.Scanner;


public class ClassAndObjectDemo {

	
	public static void main(String[] args) {
		System.out.println("Enter your marks");
		ClassAndObjectDemo obj = new ClassAndObjectDemo();
		obj.marks();

	}
   void marks(){
	   int x;
	   Scanner input= new Scanner(System.in);
	   x=input.nextInt();
	   System.out.println("Marks is:" + x);
   }
}
