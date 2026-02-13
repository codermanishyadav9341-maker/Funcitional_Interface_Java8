package Functional_Interface;

import java.util.Scanner;
@FunctionalInterface
public interface UpperCase {
    String convert(String s);
}

class Result5  implements UpperCase{
    public String convert(String s){
       return s.toUpperCase();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result5 rr = new Result5();

        System.out.print("Enter Words:- ");
        String s = scan.nextLine();

        System.out.println(s);
    }
}
