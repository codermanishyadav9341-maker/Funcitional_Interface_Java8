package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Positive {
    boolean positive(int num);
}

class Result3 implements Positive{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isPositive = num -> num > 0;

    public boolean positive(int num){
        return isPositive.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Positive number is:- " +positive(num));
    }

    public static void main(String[] args){
        Result3 rr = new Result3();
        rr.check();

    }
}