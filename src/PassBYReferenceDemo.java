
public class PassBYReferenceDemo {
    int a=10;
    void updateMethod(int b)
    {
    	a=a+b;
    }
	
	public static void main(String[] args)
	{
		PassBYReferenceDemo obj = new PassBYReferenceDemo();
		System.out.println("Before Change:"+ obj.a);
		
		PassBYReferenceDemo obj1;
		obj1=obj;
		
		obj1.updateMethod(200);
        System.out.println("After Change:"+ obj.a);

	}

}
