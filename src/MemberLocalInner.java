
public class MemberLocalInner 
{
   int a=100;
   void myMethod()
   {
	   class LocalInner
	   {
		   void display()
		   {
			   System.out.println("Outer x="+a);
			   System.out.println("its Local Inner Class");
		   }
	   }
	   LocalInner objLocalIner= new LocalInner();
	   objLocalIner.display();
   }
	
	public static void main(String[] args) 
	{
		MemberLocalInner objMemberLocalInner= new MemberLocalInner();
		objMemberLocalInner.myMethod();
	}

}
