// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
import java.util.*;
public class Pattern9 {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number -:");
       int n = sc.nextInt();
       int sum=0;
       int num=1;
       for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
       }
   }
}
