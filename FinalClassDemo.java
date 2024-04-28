package com.sun.finals;
final class Admin
{
	void comment()
	{
		System.out.println("Only admin can access");
	}
}
public class FinalClassDemo extends Admin {

	public static void main(String[] args) {
		 FinalClassDemo obj = new FinalClassDemo();
		 obj.comment();

	}

}
