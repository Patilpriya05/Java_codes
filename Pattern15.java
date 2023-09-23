//     *
//    * *
//   * * *
//  * * * *
// * * * * * 
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

import java.util.*;
public class Pattern15 {
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
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
       }
       for(int i=n; i>=1; i--){
            //spaces
            int spaces = (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
       }
   }
}
