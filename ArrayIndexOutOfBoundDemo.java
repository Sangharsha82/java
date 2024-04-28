
public class ArrayIndexOutOfBoundDemo {

	public static void main(String[] args) {
		try
		{
			int arr[]={10,20,30,40};
			System.out.println(arr[6]);
		}
		
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println("Array out of bound");
			System.out.println(o.getMessage());
		}

	}

}
