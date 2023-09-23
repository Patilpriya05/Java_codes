//Write a Java method to compute the average of three numbers.
import java.util.*;

public class function2 {
    public static void averageOfthree(int a, int b, int c){
       float avg = (a+b+c)/3;
       System.out.println("Average is -:" +avg);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number -: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number -: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number -: ");
        int c = sc.nextInt();
        averageOfthree(a, b, c);
    }
}
