import java.io.*;

public class Deserialization  {
    int id ;
    String name ;
    int age ;
    Deserialization(int id , String name , int mobile ){
        this.id= id ;
        this.name= name;
        this.age = mobile;
    }

    public static void main(String[] args) {
        Serialization obj = null;
        try{
            FileInputStream fis = new FileInputStream("D:\\javatext.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
           obj = (Serialization)ois.readObject();
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.age);

    }
}
