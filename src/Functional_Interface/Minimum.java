package Functional_Interface;

import java.util.Scanner;

@FunctionalInterface
public interface Minimum {
    int min(int a,int b);
}

class Result11 implements Minimum{
    public int min(int a, int b){
        return (a<b) ? a:b;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result11 rr = new Result11();

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your second number- ");
        int b = scan.nextInt();

        System.out.println("Minimum number is:- " +rr.min(a,b));
    }
}
