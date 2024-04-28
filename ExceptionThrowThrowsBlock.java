import java.util.Scanner;
public class ExceptionThrowThrowsBlock {
	public void readAge(int age)throws Exception
	{
		if(age<15 || age>60)
			throw new Exception();
		
		else
			System.out.println("your age is:"+age);
	}
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("please enter your age:");
		int age=in.nextInt();
		
		ExceptionThrowThrowsBlock obj=new ExceptionThrowThrowsBlock();
		try
		{
			obj.readAge(age);                                                                                       
		}
		catch(Exception o)
		{
			System.out.println("Age must be in between 15and 60..Age Entered is:"+age);
			System.out.println(o.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
