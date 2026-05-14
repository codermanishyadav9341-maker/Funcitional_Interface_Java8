package Optional.Of;

import java.util.Scanner;
import java.util.Optional;
public class Result1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Words:- ");
        String words = scan.nextLine();

        Optional<String> word = Optional.of(null);

        System.out.println(word.orElse("Default Value"));
        scan.close();
    }
}
