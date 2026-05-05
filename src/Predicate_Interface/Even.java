package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface Even {
    boolean isEven(int num);
}

class Result1 implements Even{
    Scanner scan = new Scanner(System.in);
    // Using Predicate Even number
    Predicate<Integer> isEven = num -> num%2 == 0;

    @Override
    public boolean isEven(int num){
        return isEven.test(num);
    }

//    Ya user se input lene ke liya hai

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Even number:- " +isEven.test(num));
    }

    public static void main(String[] args){
        Result1 ee = new Result1();
        ee.check();
    }

}