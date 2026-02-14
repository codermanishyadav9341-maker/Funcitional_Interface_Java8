package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface Multiple {
    boolean digits(int num);
}

class Result13 implements Multiple{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isMultiple = num -> num%10 == 0;

    @Override
    public boolean digits(int num){
        return isMultiple.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Multiple by 10:- " +digits(num));
    }

    public static void main(String[] args){
        Result13 rr = new Result13();
        rr.check();
    }
}