package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Digit2 {

    boolean digit(int num);
}

class Result11 implements Digit2{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isDigits = num -> {

        if(num >= 10 && num < 99 ){
            return true;
        }
         else{
             return false;
        }
    };

    @Override
    public boolean digit(int num){
        return isDigits.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();


        System.out.println("Two digits number:- " +digit(num));
    }

    public static void main(String[] args){
        Result11 rr = new Result11();
        rr.check();

    }
}