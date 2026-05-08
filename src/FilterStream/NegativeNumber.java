package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class NegativeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        // Display Array
        numbers.stream()
                .forEach(n->System.out.print(n+ " "));

        // Stream Processing
        List<Integer> negative =
                numbers.stream()
                        .filter(num -> num < 0)
                        .collect(Collectors.toList());

        System.out.print("\nNegative number list:- " +negative);

    }
}
