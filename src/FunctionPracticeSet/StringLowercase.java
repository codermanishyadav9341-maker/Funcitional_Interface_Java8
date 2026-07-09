package FunctionPracticeSet;

import java.util.Scanner;
import java.util.function.Function;
public class StringLowercase {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<String,String> stringLowercase = String::toLowerCase;

            System.out.print("Enter characters:- ");
            String str = scan.nextLine();

            System.out.println("Lowercase:- " +stringLowercase.apply(str));
        }
    }
}
