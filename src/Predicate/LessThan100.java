package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface LessThan100 {
    boolean less(int num);
}

class Result6 implements LessThan100{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isLess = num -> num<=100;

    public boolean less(int num){
        return isLess.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("LessThan 100:- " +less(num));
    }

    public static void main(String[] args){
        Result6 rr = new Result6();
        rr.check();
    }
}