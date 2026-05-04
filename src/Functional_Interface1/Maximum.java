package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Maximum {

    int max(int a,int b);
}

class Result32 implements Maximum{

    @Override
    public int max(int a,int b){
        return (a>b) ? a : b;
    }

    public static void main(String[] args){
        Maximum m1 = new Result32();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Maximum number is:- " +m1.max(a,b));

    }
}