package Strings.Level1;

import java.util.Scanner;

public class compareStrings {
    static boolean compare(String one,String two){
        if(one.length()!=two.length()){
            return false;
        }

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
