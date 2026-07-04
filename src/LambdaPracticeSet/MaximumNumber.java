package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface MaximumNumber {
    void checkMaximum(int num1, int num2);
}
class Result2{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            MaximumNumber  maximum = (num1,num2) ->{
                System.out.println("Maximum number:- " +Math.max(num1,num2));
            };

            System.out.print("Enter your first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter your Second number:- ");
            int num2 = scan.nextInt();

            maximum.checkMaximum(num1,num2);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! please enter integer elements");
        }
    }
}