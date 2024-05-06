public class NonStaticMemberInnerClass {
    public static void main(String[] args) {
        Outer objOuter = new Outer();
        objOuter.show();
    }
}
class Outer{
    public void show(){
        Inner objInner = new Inner();
        objInner.display();
    }

    public void display() {
    }

    class Inner{
        public void display(){
            System.out.println("this is the inner method");

        }
    }
}