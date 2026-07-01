package FunctionalPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface MinimumNumber {
    void checkMinimum(int num1,int num2);
}

class MinimumImpl implements MinimumNumber{
    @Override
    public void checkMinimum(int num1, int num2){
        int result = Math.min(num1,num2);
        System.out.println("Minimum number is:- " +result);
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter your first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter your Second number:- ");
            int num2 = scan.nextInt();

            MinimumNumber minimum = new MinimumImpl();
            minimum.checkMinimum(num1,num2);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }
    }
}