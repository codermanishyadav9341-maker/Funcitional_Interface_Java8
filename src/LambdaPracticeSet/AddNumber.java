package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface AddNumber {
    void sum(int num1,int num2);
}
class Result1{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            AddNumber add = (num1,num2) -> {
                System.out.println("Sum of two number:- " +(num1+num2));
            };

            System.out.print("Enter your first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter your Second number:- ");
            int num2 = scan.nextInt();

            add.sum(num1,num2);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}