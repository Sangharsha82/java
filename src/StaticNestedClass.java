public class StaticNestedClass {
    static int a = 10;
    static int b=20 ;
    static class StaticNestedClassdemo{
        void display(){
            System.out.println("the value of a is "+a);
            System.out.println("the value of a is "+b);


        }
    }

    public static void main(String[] args) {
        StaticNestedClass.StaticNestedClassdemo obj =new StaticNestedClass.StaticNestedClassdemo();
        obj.display();
    }
}