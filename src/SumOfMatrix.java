import java.util.Scanner;


public class SumOfMatrix {
    public static void main(String[] args){
    	int[][] a =new int[3][3];
    	int[][] b =new int[3][3];
    	int[][] sum =new int[3][3];
    	Scanner input =new Scanner(System.in);
    	System.out.println("please enter your first matrix");
    	  for(int i=0; i<3; i++){
    		  for(int j=0; j<3; j++){
    			  a[i][j]=input.nextInt();
    		  }
    	  }
    	System.out.println("please enter your second matrix");
    	for(int i=0; i<3; i++){
  		  for(int j=0; j<3; j++){
  			  b[i][j]=input.nextInt();
  		  }
  	  }
       System.out.println("your first matrix:");
       for(int i=0; i<3; i++){
   		  for(int j=0; j<3; j++){
   			  System.out.print(a[i][j]+" ");
   		  }
   		  System.out.println();
   	  }
       System.out.println("your second matrix");
       for(int i=0; i<3; i++){
    		  for(int j=0; j<3; j++){
    			  System.out.print(b[i][j]+" ");
    		  }
    		  System.out.println();
    	  }
       for(int i=0; i<3; i++){
 		  for(int j=0; j<3; j++){
 			  sum[i][j]=a[i][j]+b[i][j];
 		  }
 	  }
       System.out.println("the sum of two matrix:");
       for(int i=0; i<3; i++){
  		  for(int j=0; j<3; j++){
  			  System.out.print(sum[i][j]+" ");
  		  }
  		  System.out.println();
  	  }
    }
}
