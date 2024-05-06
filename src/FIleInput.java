import java.io.FileInputStream;
import java.io.IOException;


public class FIleInput {
    public static void main(String[] args) {
        try{
        FileInputStream  fin = new FileInputStream("C:\\javatext.txt");
        int i = 0;
            while((i = fin.read())!= -1){
                System.out.println((char)i) ;
            }fin.close();

    }
    catch (IOException e){
        System.out.println(e.getMessage());
    }
}
}