package Functional_Interface;

import java.util.Scanner;
@FunctionalInterface
public interface Add {
    int add(int a,int b);
}

class Result7 implements Add{
    public int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result7 rr = new Result7();

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Sum of two number is:- " +rr.add(a,b));

    }
}
