package Distinct_StreamAPI;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class EvenNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }


        List<Integer> result =
                numbers.stream()
                        .filter(num-> num%2 == 0)
                        .distinct()
                                .toList();


        System.out.println("Even numbers:- " +result);


        scan.close();
    }
}
