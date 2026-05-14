package Optional.Of;

import java.util.Scanner;
import java.util.Optional;
public class Practice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:- ");
        int num = scan.nextInt();

        Optional<Integer> result =
                Optional.of(num)
                        .map(n-> n*n);

        System.out.println("Square:- " +result.orElse(0));


        scan.close();


    }
}
