class SuperMethod1
{
	void display()
	{
		System.out.println("Welcome to");
	}
	
}
class SuperMethod2 extends SuperMethod1
{
	void display()
	{
		super.display();
		System.out.println("Bhaktapur Multiple Campus");
	}
}
public class SuperMethodDemoo {
	public static void main(String[] args) {
		SuperMethod2 obj = new SuperMethod2 ();
		  obj.display();
	}

}
