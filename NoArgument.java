
public class NoArgument {
    public NoArgument()
     {
    	 System.out.println("Constructor of a class A is");
     }
     
    public void display()
     {
    	 System.out.println("No Argument Constructor");
     }
	
	public static void main(String[] args) {
		NoArgument obj = new NoArgument();
		obj.display();
	}

}
 