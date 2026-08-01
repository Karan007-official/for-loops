
import java.util.*;
public class count {
  
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);

  int n =sc.nextInt();
  // int num=0;
  // int original=n;


  // while(n>0){  
  //   n/=10;

  // num++;

  // }
  // System.out.println("number of digit in " +original+"="+num);




// int sum=0;

// while(n>0){
//   int digit=n%10;
//    sum+=digit;

//    n/=10;


// }
// System.out.println(sum);





// }






int ans=0;

while(n>0){
  int digit=n%10;
  ans =ans*10+digit;
n/=10;

}

System.out.println(ans);















}
}