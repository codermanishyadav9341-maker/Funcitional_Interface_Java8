package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Prime {
    boolean prime(int num);
}

class Result9 implements Prime{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isPrime = num -> {
        if(num < 1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    };

    @Override
    public boolean prime(int num) {
        return isPrime.test(num);
    }

    public void check(){
        System.out.print("Enter your number- ");
        int num = scan.nextInt();


        System.out.println("Prime number is:- " +prime(num));
    }

    public static void main(String[] args){
        Result9 rr = new Result9();

        rr.check();
    }
}