package FunctionPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;
public class ConvertInteger {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<String,Integer> convertInteger = num -> Integer.parseInt(num);

            System.out.print("Enter number:- ");
            String str = scan.nextLine();

            System.out.println("Convert Integer:- " +convertInteger.apply(str));
        }
        catch(InputMismatchException e){
            System.out.println("Please enter valid integer");
        }
    }
}
