//         * * * * *
//       *       *
//     *       *
//   *       *
// * * * * * 

import java.util.*;
public class Pattern12 {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number -:");
       int n = sc.nextInt();
       int sum=0;
       int num=1; 
       for(int i=1; i<=n; i++){
            int spaces = (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n ||j==1 || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
       }
   }
}
