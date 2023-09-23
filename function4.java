//Write a Java method to count all vowels in a string.

import java.util.*;
public class function4 {
    public static void midCharstring(String a){
        int count=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                count++;
            }
        }
        System.out.print("Number of vowels in the string are -: " +count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string -: ");
        String a = sc.nextLine();
        midCharstring(a);
    }
}