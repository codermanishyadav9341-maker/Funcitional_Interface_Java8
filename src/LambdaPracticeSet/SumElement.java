package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface SumElement {
    void printSum(int num1,int num2);
}
class Result13{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            SumElement sum = (num1,num2) -> {
                System.out.println("Sum of two Integer number:- " +Math.addExact(num1,num2));
            };

            System.out.print("Enter first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter second number:- ");
            int num2 = scan.nextInt();

            sum.printSum(num1,num2);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}