package LambdaExpression;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface Square {
    void printSquare(int num);
}

class SquareImpl{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter your number:- ");
            int num = scan.nextInt();

            Square square = (n) -> {
                System.out.println("Square:- " +(n*n));
            };

            square.printSquare(num);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! please enter integer");
        }
    }
}