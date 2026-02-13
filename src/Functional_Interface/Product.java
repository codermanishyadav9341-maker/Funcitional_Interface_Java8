package Functional_Interface;

import java.util.Scanner;

@FunctionalInterface
public interface Product {
     int multi(int a,int b);
}

class Result9 implements Product{
    @Override
    public int multi(int a,int b){
        return a*b;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result9 rr = new Result9();


        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();


        System.out.println("Multiply of two number:- " +rr.multi(a,b));
    }
}