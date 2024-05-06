class ThreadExample extends Thread{
	@Override
	public void run() {
		int x=10;
		int y=10;
		int sum = x+y;
		System.out.println("the sum is:"+sum);
		
	}
}
public class ThreadDemo {

	
	public static void main(String[] args) {
		ThreadExample hhhh=new ThreadExample();
		hhhh.start();
	}

}
