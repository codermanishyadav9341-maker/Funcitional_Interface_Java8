package FunctionalPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface DigitsCheck {
    void checkDigits(String str);
}
class DigitsImpl implements DigitsCheck{

    @Override
    public void checkDigits(String str){
        boolean result = str.contains("8");
        System.out.println("Check:- " +result);
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Characters:- ");
            String str = scan.nextLine();

            DigitsCheck digits = new DigitsImpl();
            digits.checkDigits(str);
        }
         catch (InputMismatchException e){
            System.out.println("Invalid input");
         }
    }
}