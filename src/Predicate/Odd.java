package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Odd {

    boolean odd(int num);
}

class Result2 implements Odd{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isOdd = num -> num%2 != 0;


    public boolean odd(int num){     // Ye Predicate ke thor check ho raha hai
       return isOdd.test(num);
    }


    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Odd number is:- " +odd(num));
    }
    public static void main(String[] args){
        Result2 rr = new Result2();
        rr.check();
    }
}
