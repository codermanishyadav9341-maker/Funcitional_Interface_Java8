package FunctionPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;
public class HalfNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<Integer,Double> halfNumber = (num) -> (double) num/2;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Half number:- " +halfNumber.apply(num));
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a valid integer");
        }
    }
}
