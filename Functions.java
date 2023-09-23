import java.util.*;

public class Functions {
    // public static void calculateSum(int a, int b){
    //     int sum = a+b;
    //     System.out.println("Sum is -: " +sum); 
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter two numbers -: ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calculateSum(a, b);
    // }

    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers -: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum is -: " +sum);
    }
}
