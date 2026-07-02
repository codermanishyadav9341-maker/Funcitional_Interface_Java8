package FunctionalPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface Factorial {
    void printFactorial(int num);
}

class FactorialImpl implements Factorial{

    @Override
    public void printFactorial(int num){
        if(num < 0){
            System.out.println("Please enter non-negative number");
            return;
        }
        long fact = 1;
        for(int i = 1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial:- " +fact);
    }

    public static void main(String[] args){
       try(Scanner scan = new Scanner(System.in)){

           System.out.print("Enter your number:- ");
           int num = scan.nextInt();

           Factorial factorial = new FactorialImpl();
           factorial.printFactorial(num);
       }
       catch(InputMismatchException e){
           System.out.println("Invalid input!: Please enter integer");
       }
    }
}