package FunctionPracticeSet;

import java.util.Scanner;
import java.util.function.Function;

public class ReverseString {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<String,String> stringReverse = (str)  -> (new StringBuilder(str).reverse().toString());




            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Reverse:- " +stringReverse.apply(str));
        }
    }
}


