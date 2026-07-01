package FunctionalPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface DivisionNumber {
    void printDivision(int num1 ,int num2);
}

class DivisionImpl implements DivisionNumber{

    @Override
    public void printDivision(int num1,int num2){
        try{
            int result = Math.floorDiv(num1,num2);
            System.out.println("Division:- " +result);
        }
        catch (ArithmeticException e){
            System.out.println("Error:- Cannot divide by zero");
           System.out.println("Reason:- " +e.getMessage());
        }

    }

    public static void main(String[] args){
      try(Scanner scan = new Scanner(System.in)){


          System.out.print("Enter your first number:- ");
          int num1 = scan.nextInt();

          System.out.print("Enter your Second number:- ");
          int num2 = scan.nextInt();

          DivisionNumber division = new DivisionImpl();
          division.printDivision(num1,num2);

      }
      catch (InputMismatchException e){
          System.out.println("Invalid Input");
      }

    }
}