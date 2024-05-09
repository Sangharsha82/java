import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
int id ;
String name ;
int age ;
Serialization(int id , String name , int mobile ){
    this.id= id ;
    this.name= name;
    this.age = mobile;
}

    public static void main(String[] args) {
        try{
            Serialization obj = new Serialization(101,"Abhiraj",9);
            FileOutputStream fos = new FileOutputStream("D:\\javatext.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(obj);
            out.flush();
            out.close();
            System.out.println("Data entered");
        }catch(Exception e){
            System.out.println(e.getMessage());

        }


    }
}
