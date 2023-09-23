//Write a Java method to count all the words in a string.

import java.util.*;
public class function5 {
    public static void countWords(String str ){
       int count = 0;
       if(!(" ".equals(str.substring(0,1))) || !(" ".equals(str.substring(str.length()-1)))){
            for (int i=0; i<str.length(); i++){
                if(str.charAt(i)==' '){
                    count++;
                }
            }
            count = count + 1;
       }
       System.out.println("Number os words in a string are -:" +count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string -: ");
        String str = sc.nextLine();
        countWords(str);
    }
}