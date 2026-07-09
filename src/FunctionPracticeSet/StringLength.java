package FunctionPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;
public class StringLength {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<String,Integer> stringIntegerFunction= (str) -> str.length();

            System.out.print("Enter characters:- ");
            String str = scan.nextLine();

            System.out.println("String length:- " +stringIntegerFunction.apply(str));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
