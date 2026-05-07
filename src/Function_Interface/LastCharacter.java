package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class LastCharacter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<String,Character> last = str -> str.charAt(str.length()-1);
        Function<String,Character> first = str -> str.charAt(0);

        System.out.print("Enter your Letter:- ");
        String str = scan.nextLine();

        System.out.println("First Letter:- " +first.apply(str));
        System.out.println("Last Letter:- " +last.apply(str));


        scan.close();

    }
}
