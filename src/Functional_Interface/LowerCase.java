package Functional_Interface;

import java.util.Scanner;
@FunctionalInterface
public interface LowerCase {
    String convert(String s);
}

class Result6 implements LowerCase{
    public String convert(String s){
        return s.toLowerCase();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result6 rr = new Result6();

        System.out.print("Enter Word:- ");
        String s = scan.nextLine();

        System.out.println("LowerCase:- " +rr.convert(s));
    }
}
