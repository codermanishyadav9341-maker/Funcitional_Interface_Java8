package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Divisible {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your ArrayList:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.print("Array elements:- ");
        numbers.stream()
                .forEach(n->System.out.print(n+ " "));

        // Stream processing

        List<Integer> divisible =
                numbers.stream()
                        .filter(num -> num%5 == 0)
                        .collect(Collectors.toList());

        System.out.print("\nDivisible by 5:- " +divisible);


    }
}
