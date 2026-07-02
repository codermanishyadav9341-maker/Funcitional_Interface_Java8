package FunctionalPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface Power {
    void printPower(int num1,int num2);
}
class PowerImpl implements Power{

    @Override
    public void printPower(int num1, int num2){
        int result = (int)Math.pow(num1,num2);
        System.out.println("Number:- " +result);
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter Power:- ");
            int num2 = scan.nextInt();

            Power power = new PowerImpl();
            power.printPower(num1,num2);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input!: Please enter integer");
        }
    }
}