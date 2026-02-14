package Predicate;


import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Divisible {
    boolean divide(int num);
}

class Result7 implements Divisible{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isDivide = num -> num%5 == 0;
    Predicate<Integer> isPositive = num -> num>=0;

    public boolean divide(int num){
        return isDivide.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Divisible by 5 is:- " +divide(num));
        System.out.println("Positive number is:- " +isPositive.test(num));

    }

    public static void main(String[] args){
        Result7 rr = new Result7();
        rr.check();
    }
}
