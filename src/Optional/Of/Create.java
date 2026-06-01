package Optional.Of;

import java.util.Optional;
import java.util.Scanner;

public class Create {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name:- ");
        String name = scan.nextLine();

        Optional<String> letters = Optional.of(null);

        System.out.println("So " +letters.get());

        scan.close();


    }
}
