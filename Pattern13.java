//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

import java.util.*;
public class Pattern13 {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number -:");
       int n = sc.nextInt();
       int sum=0;
       int num=1; 
       for(int i=1; i<=n; i++){
            //spaces
            int spaces = (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
       }
   }
}
