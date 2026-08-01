
import java.util.*;
public class count {
  
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);

  int a =sc.nextInt();
  int b =sc.nextInt();
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






// int ans=0;

// while(n>0){
//   int digit=n%10;
//   ans =ans*10+digit;
// n/=10;

// }

// System.out.println(ans);

// int ans=0;
// for(int i=0;i<=n;i++){
// if(i%2==0){
// ans-=i;
// }
// else{
//   ans+=i;
// }


// }
// System.out.println(ans);





// int fac=1;

// for(int i=1;i<=n;i++){
//    fac=fac*i;
//    System.out.println("Factorial of"+ " "+i+":"+fac);
// }



int ans=1;

for(int i=1;i<=b;i++){

  ans=ans*a;



}
System.out.println(ans);













}
}