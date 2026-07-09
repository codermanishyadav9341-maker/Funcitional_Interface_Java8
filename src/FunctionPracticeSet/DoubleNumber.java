package FunctionPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;
public class DoubleNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            Function<Integer, Integer> doubleNumber = (num) -> num * 2;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Double number:- " + doubleNumber.apply(num));
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer");
        }
    }

}