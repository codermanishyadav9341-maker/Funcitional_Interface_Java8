package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface GreaterThan {
    boolean greater(int num);
}

class Result14 implements GreaterThan{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isGreater = num -> num>=18;

    @Override
    public boolean greater(int num){
        return isGreater.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("GreaterThan 18:- " +greater(num)) ;
    }

    public static void main(String[] args){
        Result14 rr = new Result14();

        rr.check();
    }
}