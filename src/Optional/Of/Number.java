package Optional.Of;

import java.util.Scanner;
import java.util.Optional;
public class Number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:- ");
        int num = scan.nextInt();

        Optional<Integer> number = Optional.of(num);

        System.out.println("Digits:- " +number.get());
        scan.close();
    }
}
