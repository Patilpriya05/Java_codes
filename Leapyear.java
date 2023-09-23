import java.util.*;
public class Leapyear {
    public static void main(String args[]){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year -:");
        year = sc.nextInt();
        if(((year%4)==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
