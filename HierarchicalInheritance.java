class SuperClass
{
	void input()
	{
		System.out.println("your name:");
	}
}

class SubClass11 extends SuperClass
{
	void show()
	{
		System.out.println("My name is Isha");
	}
}

class SubClass22 extends SuperClass
{
	void display()
	{
		System.out.println("My name is Dipesh");
	}
}

class SubClass33 extends SuperClass
{
	void display()
	{
		System.out.println("My name is sumina");
	}
}

public class HierarchicalInheritance 
{
	public static void main(String[] args)
	{
		SubClass11 obj1 = new SubClass11();
		SubClass22 obj2 = new SubClass22();
		SubClass33 obj3 = new SubClass33();
		 
		obj1.input();
		obj1.show();
		obj2.input();
		obj2.display();
		obj3.input();
		obj3.display  ();
		

	}

}
