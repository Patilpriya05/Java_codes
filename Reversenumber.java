import java.util.*;    
public class Reversenumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number -:");
        int n = sc.nextInt();
        int lastdig, rev;
        System.out.print("Reverse of number is -:");
        while(n>0){
            lastdig = n%10;
            System.out.print(lastdig);
            n = n/10;
        }
        System.out.println();
    }
}
