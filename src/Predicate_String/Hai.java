package Predicate_String;

import jdk.jfr.Unsigned;

import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface Hai {
    boolean isHai(String str);
}

class Result4 implements Hai{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isHai = str -> str != null && str.contains("@");

    public boolean isHai(String str){
        return isHai.test(str);
    }

    public void check(){
        System.out.print("Enter Characters:- ");
        String str = scan.nextLine();

        System.out.println("Check:- " +isHai.test(str));
    }

    public static void main(String[] args){
        Result4  rr = new Result4();
        rr.check();
    }
}