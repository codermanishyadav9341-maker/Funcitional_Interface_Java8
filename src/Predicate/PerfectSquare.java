package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface PerfectSquare {
    boolean Square(int num);
}

class Result10 implements PerfectSquare{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isPerfectSquare = num -> {
        if(num < 0){
            return false;
        }
        int square = (int)Math.sqrt(num);
        return square*square == num;
    };


    public boolean Square(int num){
        return isPerfectSquare.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Perfect Square:- " +Square(num));
    }

    public static void main(String[] args){
        Result10 rr = new Result10();
        rr.check();

    }
}