package FunctionPracticeSet;

import java.util.Scanner;
import java.util.function.Function;
public class StringUppercase {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<String,String> stringUppercase = (str) -> str.toUpperCase();

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Uppercase:- " +stringUppercase.apply(str));
        }
    }
}
