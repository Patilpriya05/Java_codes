//Write a Java method to display the middle character of a string.
// Note: a) If the length of the string is odd there will be two middle characters.
// b) If the length of the string is even there will be one middle character.

import java.util.*;

public class function3 {
    public static void midCharstring(String a){
        int position, length;
        if(a.length()%2==0){
            position = a.length()/2-1;
            length = 2;
        }  
        else{
            position = a.length()/2;
            length = 1;
        }
        System.out.println("The middle character in the string -: "+a.substring(position, position+length));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string -: ");
        String a = sc.nextLine();
        midCharstring(a);
    }
}