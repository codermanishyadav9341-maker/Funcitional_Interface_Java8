package Predicate_String;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface PassWord {
    boolean isPassword(String str);
}

class Result13 implements PassWord{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isPassword = str -> str != null && str.matches("93419675mk");

    public boolean isPassword(String str){
        return isPassword.test(str);
    }

    public void check(){
        System.out.print("Enter your Password:- ");
        String str = scan.nextLine();

        System.out.println("Match Your PassWord:- " +isPassword(str));
    }

    public static void main(String[] args){
        Result13 rr = new Result13();
        rr.check();
    }
}
