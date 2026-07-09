package FunctionPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;
public class CubeNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<Integer,Long> cubeFunction = (num) -> (long)num*num*num;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Number of cube:- " +cubeFunction.apply(num));
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a integer value");
        }
    }
}
