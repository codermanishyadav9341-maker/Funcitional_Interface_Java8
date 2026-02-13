package Functional_Interface;

import java.util.Scanner;
@FunctionalInterface
public interface Maximum {
    int max(int a,int b);
}

class Result10 implements Maximum{
    @Override
    public int max(int a,int b){
        return (a>b) ? a:b;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result10 rr = new Result10();

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();



        System.out.println("Maximum number is:- " +rr.max(a,b));
    }
}
