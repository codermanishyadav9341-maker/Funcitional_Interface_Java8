package Reduce_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
public class SumEvenNumber {
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
                        .filter(num -> num%2 == 0)
                        .reduce((a,b) -> a+b);

        System.out.println("Sum of even number:- " +result.orElse(0));


    }
}
