package FunctionalPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface EqualsNumber {
    void checkEquals(int num1, int num2);
}

class EqualImpl implements EqualsNumber{

    @Override
    public void checkEquals(int num1,int num2){
        boolean result = num1 == num2;
        System.out.println("Equals Check:- " +result);
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter your first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter your Second number:- ");
            int num2 = scan.nextInt();

            EqualsNumber equals = new EqualImpl();
            equals.checkEquals(num1,num2);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input only for digits");
        }
    }
}