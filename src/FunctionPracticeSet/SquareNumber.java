package FunctionPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;
public class SquareNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<Integer,Long> squareFunction = (num) -> (long)  num*num;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Square number:- " + squareFunction.apply(num));

        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
