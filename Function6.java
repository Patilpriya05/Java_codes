import java.util.*;

public class Function6 {
    public static void Multiply(int a , int b){
        int product = a * b;
        return product;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number -: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number -: ");
        int b = sc.nextInt();
        int prod = Multiply(a,b)
        System.out.println("Product is -:"  + prod);
    }
}
