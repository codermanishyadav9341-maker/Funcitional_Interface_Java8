package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class Letter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<String, Character> first = ch -> ch.charAt(0);

        System.out.print("Enter your characters:- ");
        String ch = scan.nextLine();

        System.out.println("First Letter:- " +first.apply(ch));

        scan.close();

    }
}
