package Predicate_String;

import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface Java {
    boolean isJava(String str);
}

class Result11 implements Java{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isJava = str -> str != null && str.contains("Java");

    public boolean isJava(String str){
        return isJava.test(str);
    }

    public void check(){
        System.out.print("Enter your Characters:- ");
        String str = scan.nextLine();

        System.out.println("Java check:- " +isJava(str));
    }

    public static void main(String[] args){
        Result11 rr = new Result11();
        rr.check();
    }
}