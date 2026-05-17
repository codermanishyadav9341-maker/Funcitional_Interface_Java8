package Basic_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
public class ArraySum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        Optional<Integer> result =
                numbers.stream()
                        .reduce((a,b) -> a+b);

        System.out.println("Sum of Array elements:- " +result.get());

        scan.close();

    }
}
