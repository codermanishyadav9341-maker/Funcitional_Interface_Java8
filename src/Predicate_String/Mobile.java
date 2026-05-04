package Predicate_String;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Mobile {
    boolean isMobile(String str);
}

class Result12 implements Mobile{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isMobile = str -> str != null && str.matches("9341967541");

    @Override
    public boolean isMobile(String str){
        return isMobile.test(str);
    }

    public void check(){
        System.out.print("Enter your Phone number:- ");
        String str = scan.nextLine();

        System.out.println("Match PhoneNumber:- " +isMobile(str));

    }

    public static void main(String[] args){
        Result12 rr = new Result12();
        rr.check();


    }

}