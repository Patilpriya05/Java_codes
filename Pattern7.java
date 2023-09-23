// 1 2 3 4
// 1 2 3
// 1 2 
// 1 
import java.util.*;
public class Pattern7 {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number -:");
       int n = sc.nextInt();
       for(int i=n; i>=n; i--){
           for(int j=1; j<=(n-i)+1; j++){
               System.out.print(j+" ");
           }
              System.out.print("\n");
       }
   }
}
