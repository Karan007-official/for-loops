import java.util.*;


class MystringTest{

//   // static int PrintLength(String str){
//   //   int count=0;
//   //   for(char ch:str.toCharArray()){
//   //     count++;
//   //   }
//   //   return count;
//   // }

// // static int VowelCount(String str){

// //   int count=0;

// //   for(int i=0;i<str.length();i++){
// //     char ch=str.charAt(i);
// //     if(ch=='a' || ch=='e' ||  ch=='o' || ch=='i' || ch== 'u'||  ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch== 'U' ){
// //       count++;
// //     }
// //   }
// //   return count;

// //  }


static String Hello(String str){

  String reverse="";
  
  for(int i=str.length()-1;i>=0;i--){
char ch=str.charAt(i);
reverse+=ch;


  }
  return reverse;


}


static boolean isPalindrome(String str){
  String original =str;
  String reverse=Hello(original);

  for(int i=0;i<original.length();i++){
    char ch1=original.charAt(i);
    char ch2=reverse.charAt(i);
    if(ch1!=ch2){
      return false;
    }
  }
  return true;
}



  
public static void main(String args[]){
  String name="kaak";
//   // System.out.println(PrintLength(name));

// // System.out.println(VowelCount(name));

System.out.println(isPalindrome(name));



 }

}


// class MystringTest{
// public static void main(String args[]){
// Scanner sc =new Scanner(System.in);
// int X =sc.nextInt();
// int Y =sc.nextInt();
//  int[][] arr= new int[X][Y];



//  for(int i=0;i<X;i++){
//   for(int j=0;j<Y;j++){
//     arr[i][j]=sc.nextInt();
//   }
//  }

//  for(int i=0;i<X;i++){
//  for(int j=0;j<Y;j++){
//   System.out.print(arr[i][j]+" ");
//  }
//  System.out.println();
//  }

// }
// }