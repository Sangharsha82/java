public class MethodOverriding
{
    public static void main(String[]args){

demoParent obj1 = new demo1();
 obj1.mul(4,5);
    }
}

class demoParent{
    void mul(int x, int y){
        System.out.println("the multiplication from parent is "+(x*y));
    }
}
class demo1 extends demoParent{
    void mul(int x, int y){
        System.out.println("the multiplication from child is "+(x*y));
    }
}