// Write a Java method to find the smallest number among three numbers.
// Test Data:
// Input the first number: 25
// Input the Second number: 37
// Input the third number: 29
import java.util.*;

public class Function1greatestOf3 {
    public static void smallestAmongthree(float a, float b, float c){
        if(a<b && a<c){
            System.out.println("The smallest values is "+a);
        }
        else if(b<a && b<c){
            System.out.println("The smallest values is "+b);
        }
        else{
            System.out.println("The smallest value is "+c);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number -: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number -: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number -: ");
        int c = sc.nextInt();
        smallestAmongthree(a, b, c);
    }
}
