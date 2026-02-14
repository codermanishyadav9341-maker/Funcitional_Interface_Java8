package Predicate;


import java.util.Scanner;
import java.util.function.Predicate;


@FunctionalInterface
public interface Negative {
    boolean negative(int num);
}
class Result4 implements Negative{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isNegative = num -> num<0;

    @Override
    public boolean negative(int num){
        return isNegative.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Check Negative number:- " +negative(num));
    }

    public static void main(String[] args){
        Result4 rr = new Result4();
        rr.check();

    }
}