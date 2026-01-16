package Strings.Level1;

import java.util.Scanner;

public class compareStrings {
    // This method compare is used to compare two strings for equality manually
    static boolean compare(String one,String two){
        if(one.length()!=two.length()){
            return false;
        }

        // For loop is used to check each character in the strings for equality
        for(int i=0;i<one.length();i++){
            if(one.charAt(i)!=two.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        boolean compareProper = compare(one,two);
        boolean compareFunction = one.equals(two);

        System.out.println(compareProper);
        System.out.println(compareFunction);
    }
}
