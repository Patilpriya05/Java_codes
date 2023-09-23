// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *
import java.util.*;
public class Pattern10 {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number -:");
       int n = sc.nextInt();
       int sum=0;
       int num=1;
       //UPPER HALF (1st part)
       for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            //(2nd part)
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
       }
       //LOWER HALF (1st part)
       for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            //(2nd part)
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
       }
   }
}
