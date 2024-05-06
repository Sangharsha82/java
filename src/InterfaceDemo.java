interface A
{
	void display();
}
 interface B{
	 void show();
	 
 }
public class InterfaceDemo implements A,B {
  int id;
  String name;
	
	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
          obj.display();
          obj.show();
          
	}
	public void display(){
		System.out.println("Welcome to");
	}
	
	public void show(){
		System.out.println("Java Program");
	}
	
	
}
