import java.util.*;
public class SumOFNnatrualNo {
    public static void main(String args[]){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number -:");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.print("Sum Of all natural numbers are -: " +sum);

    }
}
