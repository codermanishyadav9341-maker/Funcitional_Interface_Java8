package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class PositiveNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your ArrayList:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        // Display Array
        System.out.print("Array List:- ");
        numbers.stream()
                .forEach(n->System.out.print(n+ " "));

        // stream processing

        List<Integer> isPositive =
                           numbers.stream()
                                   .filter(num -> num > 0)
                                   .collect(Collectors.toList()) ;

        System.out.println("\nPositive number list:- " +isPositive);

    }
}
