import java.util.*;

public class Array{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

 int a = sc.nextInt();
        int b = sc.nextInt();

        // 2D array
        int[][] arr = new int[a][b];

        // Take input
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        // Print array
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

for (int j = 0; j < arr[0].length; j++) {

    int sum = 0;

    for (int i = 0; i < arr.length; i++) {

        sum += arr[i][j];
    }

    System.out.println(sum);
}
  }
}
