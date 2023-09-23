//      *
//     * *
//    *   *
//   *     *
//  *       *
// * * * * * *
import java.util.*;
public class Pattern18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row numbers -:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int spaces = (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=i; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
       }
    }
}
