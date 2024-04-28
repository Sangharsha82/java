
public class ExceptionMultipleCatchBlock {
	public static void main(String[] args) {
		try
		{
			int a=10,b=5, div ;
			div=a/b;
			System.out.println(div);
			
			int arr[]={10,20,30,40};
			System.out.println(arr[2]);
			
			String str="isha";
			System.out.println(str.toUpperCase());
		}
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic Exception");
		}
		
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println("Array Exception");
			System.out.println(o.getMessage());
		}

	}

}
