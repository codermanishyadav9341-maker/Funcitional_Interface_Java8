package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface LowerCase {
    String toLower(String s);
}

class Result63 implements LowerCase{

    @Override
    public String toLower(String s){
        return s.toLowerCase();
    }

    public static void main(String[] args){
        LowerCase lc = new Result63();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Characters:- ");
        String s = scan.next();

        System.out.println("LowerCase:- " +lc.toLower(s));
    }
}