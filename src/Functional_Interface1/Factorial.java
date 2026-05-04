package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Factorial {
    int fact(int num);
}

class Result31 implements Factorial{

    public int fact(int num){
        int f = 1;
        for(int i = 1; i<=num; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args){
        Factorial ff = new Result31();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Factorial is:- " +ff.fact(num));

        scan.close();

    }
}