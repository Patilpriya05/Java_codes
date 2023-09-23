//     1
//    212
//   32123
//  4321234
// 543212345

import java.util.*;
public class Pattern14 {
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
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
       }
   }
}
