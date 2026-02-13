package Functional_Interface;

import java.util.Scanner;

@FunctionalInterface
public interface Subtract {
    int sub(int a,int b);
}

class Result8 implements Subtract{
    public int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result8 rr = new Result8();

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Subtract of two number:- " +rr.sub(a,b));
    }
}