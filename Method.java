
import java.util.*;

public class Method {
  

//   static void Hello(int n){
 
//     for(int i=1;i<=10;i++){

      
//    int ans=n*i;
//    System.out.println(ans);
//     }
   
//   }

static int Square(int number) {
  return number *number;
}





  public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int result=Square(n);
    System.out.println(result);
    

//     Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();


// Hello(n);

  }

}