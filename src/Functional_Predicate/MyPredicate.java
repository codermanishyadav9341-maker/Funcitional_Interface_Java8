package Functional_Predicate;

import java.util.Scanner;

@FunctionalInterface
interface MyPredicate {
    boolean check(int num);
}

class Result1{
    public static void main(String[] args){
        MyPredicate isEven = num -> num%2 == 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Even number is:- " +isEven.check(num));
    }
}
