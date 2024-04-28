
public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		ThreadLifeCycleA t1=new ThreadLifeCycleA();
		ThreadLifeCycleB t2=new ThreadLifeCycleB();
		
		t1.start();
		
		t1.yield();
		try{
			t1.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		t2.start();
		System.out.println("Main Thread End");
	}

}
