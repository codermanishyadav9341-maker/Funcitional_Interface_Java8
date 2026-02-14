package Predicate;


import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Divisible2 {
    boolean divisible(int num);
}

class Result8 implements Divisible2{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isDivisible = num -> ((num%3 == 0) && (num%7 ==0));

    Predicate<Integer> isPositive = num -> num >=0;

    public boolean divisible(int num){
        return isDivisible.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Positive number is:- " +isPositive.test(num));
        System.out.println("Divisible by (3 && 7):- " +divisible(num));
    }

    public static void main(String[] args){
        Result8 rr = new Result8();
        rr.check();
    }
}
