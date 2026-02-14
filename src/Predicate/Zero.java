package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Zero {
    boolean zero(int num);
}

class Result5 implements Zero{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isZer0 =  num -> num == 0;

    public boolean zero(int num){
        return isZer0.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("check Zero number is:- " +zero(num));
    }

    public static void main(String[] args){
        Result5 rr = new Result5();
        rr.check();
    }
}