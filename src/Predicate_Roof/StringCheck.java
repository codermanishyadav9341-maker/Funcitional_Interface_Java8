package Predicate_Roof;

import java.util.Scanner;
import java.util.function.Predicate;

public class StringCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Empty String
        Predicate<String> isEmpty = str -> str != null && str.isEmpty();

        // String null or Empty
        Predicate<String> isNull = str -> str == null && str.isEmpty();

        // String Length > 5
        Predicate<String> isLength = str -> str.length() > 5;

        // String Start with M
        Predicate<String> isStart = str -> str != null && str.startsWith("M");

        // String end with H;
        Predicate<String> isEnd = str -> str != null && str.endsWith("H");

        // String contains Java
        Predicate<String> isContains = str -> str != null && str.contains("Java");

        // String UpperCase
        Predicate<String> isUppercase = str -> str != null && str.equals(str.toUpperCase());

        // String LowerCase
        Predicate<String> isLowercase = str -> str != null && str.equals(str.toLowerCase());

        // String Palindrome
        Predicate<String> isPalindrome = str -> new StringBuilder(str).reverse().toString().equals(str);

        System.out.print("Enter your Characters:- ");
        String str = scan.nextLine();

        System.out.println("------------------=:Result:=-----------------");
        System.out.println("Is Empty String is:- " +isEmpty.test(str));
        System.out.println("Is String empty or null is:- " +isNull.test(str));
        System.out.println("Is String length > 5 is:- " +isLength.test(str));
        System.out.println("Is String start with M:- " + isStart.test(str));
        System.out.println("Is String end with H is:- " +isEnd.test(str));
        System.out.println("Is String Contain Java is:- " +isContains.test(str));
        System.out.println("Is String UpperCase is:- " + isUppercase.test(str));
        System.out.println("Is String LowerCase is:- " +isLowercase.test(str));
        System.out.println("Is String Palindrome is:- " +isPalindrome.test(str));

    }
}
