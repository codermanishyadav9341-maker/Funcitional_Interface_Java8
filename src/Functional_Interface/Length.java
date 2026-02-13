package Functional_Interface;

import java.util.Scanner;

@FunctionalInterface
public interface Length {
    int length(String s);
}

class Result4 implements Length{
    public int length(String s){
        return s.length();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result4 rr = new Result4();


        System.out.print("Enter your Letter:- ");
        String s = scan.next();

        System.out.println("Manish letter count:- " +rr.length(s));
    }
}
