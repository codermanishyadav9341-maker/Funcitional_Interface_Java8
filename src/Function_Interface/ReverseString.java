package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class ReverseString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<String,String> reverse = str -> new StringBuilder(str).reverse().toString();

        System.out.print("Enter your characters:- ");
        String str = scan.nextLine();

        System.out.println("Reverse String:- " +reverse.apply(str));

    }
}
