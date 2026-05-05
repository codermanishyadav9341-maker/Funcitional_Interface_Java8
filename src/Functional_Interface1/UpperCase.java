package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface UpperCase {
    String toUpper(String s);
}

class Result62 implements UpperCase{

    @Override
    public String toUpper(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args){
        UpperCase up = new Result62();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Characters:- ");
        String str = scan.next();

        System.out.println("UpperCase:- " +up.toUpper(str));

    }
}