package FunctionPracticeSet;

import java.util.Scanner;
import java.util.function.Function;
public class CharacterFirstLetter {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<String,Character> firstLetter = str -> str.charAt(0);

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Character firstLetter:- " +firstLetter.apply(str));

        }
    }
}
