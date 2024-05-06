class outer
{
	public void display()
	{
		Inner objInner= new Inner();
		objInner.show();
	}
	class Inner
	{
		public void show()
		{
			System.out.println("Welcome to Java Class");
		}
	}
}
public class MemberInnerClass 
{
	public static void main(String[] args)
	{
		Outer objOuter= new Outer();
		objOuter.display();

	}

}
