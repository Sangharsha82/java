class Company{
	 final void comment(){
  	  System.out.println("Only company admin can access");
    }
}
public class FinalMethodDemo extends Company {
        void display()
        {
        	System.out.println("Intern trying to access");
        }
	
	public static void main(String[] args) {
		FinalMethodDemo obj = new FinalMethodDemo();
		obj.comment();

	}

}
