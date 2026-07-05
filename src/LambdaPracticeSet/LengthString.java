package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface LengthString {
    void printLength(String str);
}
class Result6{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            LengthString length = (str) -> {
                System.out.println("StringLength:- " +str.length());
            };

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            length.printLength(str);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}