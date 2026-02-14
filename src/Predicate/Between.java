package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Between {
    boolean between(int num);
}

class Result12 implements Between{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isDigits = num -> num>10 && num <=50;


    @Override
    public boolean between(int num){
        return isDigits.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Number Between 10 and 50 is:- " +between(num));
    }

    public static void main(String[] args){
        Result12  rr = new Result12();
        rr.check();
    }
}