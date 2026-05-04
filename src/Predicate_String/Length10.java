package Predicate_String;

import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface Length10 {
    boolean isLength(String str);
}

class Result3 implements Length10{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isLength = str -> str != null && str.length() <10;

    public boolean isLength(String str){
        return isLength.test(str);
    }

    public void check(){
        System.out.print("Enter your Words:- ");
        String str = scan.nextLine();

        System.out.println("String length < 10:- " +isLength(str));
    }

    public static void main(String[] args){
        Result3 rr = new Result3();
        rr.check();

    }
}