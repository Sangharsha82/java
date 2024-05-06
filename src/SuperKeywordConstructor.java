class SuperConstructor1
{
	int a=10;
	SuperConstructor1()
	{
		System.out.println("This is parent class");
	}
}
   class SuperConstructor2 extends SuperConstructor1
{
	public SuperConstructor2()
	{
		System.out.println("child class");
	}
}
public class SuperKeywordConstructor {

	
	public static void main(String[] args) {
		SuperConstructor2 obj = new SuperConstructor2();
	}

}
