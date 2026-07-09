package FunctionPracticeSet;

import java.util.Scanner;
import java.util.function.Function;
public class CharacterLastLetter {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<String,Character>  lastLetter = (str) -> str.charAt(str.length() -1);

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Character last letter:- " +lastLetter.apply(str));

        }
    }
}
