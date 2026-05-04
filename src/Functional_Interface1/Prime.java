package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Prime {
    boolean isPrime(int num);
}

class Result56 implements Prime{

    @Override
    public boolean isPrime(int num){
        if(num <= 1)
            return false;
        for(int i = 2; i<=num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Prime pp = new Result56();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Prime number check:- " +pp.isPrime(num));

        scan.close();

    }
}
