import java.util.*;

public class pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int  x = sc.nextInt();
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=x;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }



// for(int i=1;i<=n;i++){
//     for(int j=1;j<=x;j++){
//         if(i==1 || i==n || j==1 || j==x)
//             System.out.print("*");
//         else
//             System.out.print(" ");
//     }
// System.out.println();
// }


for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++ ){
        System.out.print("*");
    }
    System.out.println();
}





    }
}