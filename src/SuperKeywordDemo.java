class SuperKeywordVariable1
{
	int a = 5;
}
class SuperKeywordVariable2 extends SuperKeywordVariable1
{
	int a=10;
	void display(){
		System.out.println("a:"+a);
		System.out.println("the value of a:"+ super.a);
	}
}
public class SuperKeywordDemo {
       public static void main(String[] args)
       {
    	   SuperKeywordVariable2 obj = new SuperKeywordVariable2();
    	    obj.display();
       }
}
