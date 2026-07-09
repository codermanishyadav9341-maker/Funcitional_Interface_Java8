package FunctionPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;

public class ConvertString {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            Function<Integer,String>  stringConvert = (num) -> {
                return (String) Integer.toString(num);
            };

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Convert string:- " +stringConvert.apply(num));

        }
        catch(InputMismatchException e){
            System.out.println("Please enter valid integer");
        }
       }
    }