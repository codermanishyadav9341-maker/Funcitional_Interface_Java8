package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface SquareNumber {
    void printSquare(int num);
}
class Result4{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)) {
            SquareNumber square = (num) -> {
                System.out.println("Square:- " + (num * num));
            };

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            square.printSquare(num);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}