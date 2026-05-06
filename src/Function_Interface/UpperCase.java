package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class UpperCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<String,String> upperCase = str -> str.toUpperCase();

        System.out.print("Enter your characters:- ");
        String str = scan.nextLine();

        System.out.println("UpperCase:- " +upperCase.apply(str));

        scan.close();

    }
}
