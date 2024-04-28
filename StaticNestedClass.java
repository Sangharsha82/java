
public class StaticNestedClass {
 static int a=10;
  static int b =20;
     static class StaticNestedDemo
     {
    	 void show()
    	 {
    		 System.out.println("Value of A:"+a);
    		 System.out.println("Value of B:"+b);
    	 }
     }
	
	public static void main(String[] args) {
		StaticNestedClass.StaticNestedDemo obj=new StaticNestedClass.StaticNestedDemo();
		obj.show();
		

	}

}
