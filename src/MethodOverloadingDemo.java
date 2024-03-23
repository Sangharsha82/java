public class MethodOverloadingDemo{
    public static void  main(String[]args){
        demo obj = new demo();
        obj.sum(5,2);
        obj.sum(3.0,4.0);


    }
}
class demo{
    void sum(int x,int y)
    {
        System.out.println("int was called");
        System.out.println("the sum is "+(x+y));

    }
    void sum(double a, double b){
        System.out.println("Double was called");
        System.out.println("the sum is "+(a+b));
    }
}