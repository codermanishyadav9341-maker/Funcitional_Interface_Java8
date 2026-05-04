package Functional_Interface1;

import java.util.Scanner;

@FunctionalInterface
public interface Add {
    void add(int a,int b);
}

class Result21 implements Add{

    public void add(int a,int b){
        System.out.println("Sum of a and b is:- " +(a+b));
    }

    public static void main(String[] args){
        Add ad = new Result21();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        ad.add(a,b);
    }
}