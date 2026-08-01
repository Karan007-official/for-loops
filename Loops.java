import java.util.*;


public class Loops {
public static void main(String[] args) {
  

  Scanner sc=new Scanner(System.in);
  // int a=sc.nextInt();
  // int b=sc.nextInt();
  // int c=sc.nextInt();

// int max=a;

// if(b>max){
//   max=b;

// }
// if(c>max){
//   max=c;
// }
// System.out.println(max);




// int max=Math.max(c,Math.max(a,b));


// System.out.println(max);

// System.out.print(Math.max(34,54));





// Scanner sc=  new Scanner(System.in);





// String c=sc.next().trim();
// System.out.println(c);





// String str="                    name                " ;

// System.out.println(str.trim());


// char ch=sc.next().trim().charAt(0);


// if(ch>='a' && ch<='z'){
//   System.out.println("LowerCase");
// }
// else{
//   System.out.println("Uppercase");
// }




// int n=sc.nextInt();
// int a=0,b=1,count=0;
// while(count<n){
//   int c=b;
//   b+=a;
//   a=c;
//   count++;
// }
// System.out.println(b);



// int a=0,b=1;

// for(int i=2;i<=n;i++){
// int c=a+b;
// a=b;
// b=c;
// }
// System.out.println(b);


// int count=0;
// int target =3;

// while(n>0){
//   int digit=n%10;
//   if(digit==target){
//     count++;
//   }

//   n/=10;


  
// }


// System.out.println(count);


// int rev=0;

// while(n>0){
//   int digit=n%10;
//   rev=rev*10+digit;
//   n/=10;

// }
// System.out.println(rev);


int ans=0;
while(true){

    System.out.println("enter operator");

    char ch = sc.next().trim().charAt(0);




    if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(ch == '+'){
            ans = num1 + num2;
        }
        else if(ch == '-'){
            ans = num1 - num2;
        }
        else if(ch == '*'){
            ans = num1 * num2;
        }
        else if(ch == '/'){
            ans = num1 / num2;
        }
        else if(ch == '%'){
            ans = num1 % num2;
        }



 


  

    }
      else if(ch=='x' || ch=='X'){
    break;
   }
   else{
    System.out.println("invalid syntax");
   }
 System.out.println(ans);
        
}


}  
}
