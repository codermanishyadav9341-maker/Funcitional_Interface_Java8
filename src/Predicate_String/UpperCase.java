package Predicate_String;

import java.util.Scanner;
import java.util.function.Predicate;


@FunctionalInterface
public interface UpperCase {
    boolean isUpperCase(String str);
}

class Result8 implements UpperCase{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isUpperCase = str -> str != null && str.equals(str.toUpperCase());

    public boolean isUpperCase(String str){
        return isUpperCase.test(str);
    }

    public void check(){
        System.out.print("Enter your Characters:- ");
        String str = scan.nextLine();

        System.out.println("UpperCase:- " +isUpperCase.test(str));
    }

    public static void main(String[] args){
        Result8 rr = new Result8();
        rr.check();

    }
}