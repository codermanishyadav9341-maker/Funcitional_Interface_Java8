package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class Length {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<String,Integer> length = str -> str.length();

        System.out.print("Enter your characters:- ");
        String str = scan.nextLine();

        System.out.println("Letter Length:- " +length.apply(str));

        scan.close();

    }
}
