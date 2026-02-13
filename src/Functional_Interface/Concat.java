package Functional_Interface;

import java.util.Scanner;

@FunctionalInterface
public interface Concat {
    String join(String a,String b);
}

class Result12 implements Concat{

    @Override
    public String join(String a,String b){
        return a+b;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result12 rr = new Result12();

        System.out.print("Enter first Word:- ");
        String a = scan.next();

        System.out.print("Enter your Second Words:- ");
        String b = scan.next();


        System.out.println("Complete Words:- " +rr.join(a, b));
    }
}