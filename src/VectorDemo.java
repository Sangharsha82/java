import java.util.Vector;

public class VectorDemo {


public static void main(String[] args) {
    Vector vector= new Vector();
    System.out.println("Capacity of vector:"+vector.capacity());
    vector.add("Ram");
    vector.add("Hari");
    vector.add(10);
    vector.add(1,20);
    System.out.println(vector);
    System.out.println("Size of vector:"+vector.size());
    for (int i = 0 ; i< vector.size(); i++){
        System.out.println("Vector Elements are "+ i + ":"+ vector.get(i));
    }

}
}