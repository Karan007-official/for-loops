import java.util.*;
public class kk {

//  void PrintString(String str){
//   // int n=str.length();
//   for(int i=0;i<str.length();i++){
//     char ch=str.charAt(i);
//  System.out.println(ch);
//   }
// }

// static int CountString(String str){
// char[] arr=str.toCharArray();
// int len=arr.length;
// return len;
// }

// static int Count(String str){
// int count=0;
// for(int i=0;i<str.length();i++){
//   count++;
// }
// return count;

// }


// static int VowelsCount(String str){
//   int count=0;
//   for(int i=0;i<str.length();i++){
//     char ch=str.charAt(i);
//     if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
//       count++;
//     }
//   }
//   return count;
// }


// static String reverseString(String str){
//   String reverse="";
//   for(int i=str.length()-1;i>=0;i--){
// char ch=str.charAt(i);
// reverse+=ch;

//   }
//   return reverse;
// }


// static boolean isPalindrome(String str){

// String original=str;
// String reverse=reverseString(original);
// for(int i=0;i<original.length();i++){
//   char ch=original.charAt(i);
// char ch1=reverse.charAt(i);
// if(ch!=ch1){
//   return false;
// }
// }
// return true;
// }


//  public static void main(String[] args) {

  
//  String b="karan";
//  System.out.println(isPalindrome(b));


//  String b="karan";
//  System.out.println(Count(b));



// String b="karan";
// System.out.println(CountString(b));


    // String a="love";
    // String b="LOVE";

    // if(a.equalsIgnoreCase(b)){
    //   System.out.println("Both are equal");
    // }else{
    //   System.out.println("Both are not equal");
    // }

//     Scanner sc=new Scanner(System.in);
//   System.out.println("provind the string content");

//   String str=sc.nextLine();
// System.out.println("value: "+str);


//   System.out.println("provind the string content");
//   String str2=sc.next();
// System.out.println("value: "+str2);




// String a="karan";
// System.out.println(a.length());


// String str="KARAN";
// String ch=str.replace("A","C");
// System.out.println(ch);



// String str="karan";
// for(int i=0;i<str.length();i++){
//   char ch=str.charAt(i);
//   System.out.println(ch);

// }





// static void printString( String str){
//   for(int i=0;i<str.length();i++){
//     char ch=str.charAt(i);
//     System.out.println(ch);
//   }
// }


static int CountString(String str){
  int count=0;
  for(char ch: str){
    count++;
  }
  return count;
}


public static void main(String[] args) {
    

String str="karan";
System.out.println(CountString(str))

// String str="karan";
// printString(str);











  }
  
}
