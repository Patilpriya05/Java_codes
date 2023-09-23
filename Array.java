// Program to enter n numbers in array and find out even and odd number saperately

import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to enter in the array-:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements of array -:");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Even elements are -:");
        for(int i=0; i<n; i++){
            if(a[i]%2==0)
                System.out.print(a[i]+ "  ");
        }
        System.out.println("\nodd elements are -:");
        for(int i=0; i<n; i++){
            if(a[i]%2!=0)
               System.out.print(a[i]+ "  ");
        }

    }
}
