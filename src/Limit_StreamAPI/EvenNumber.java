package Limit_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EvenNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = Integer.parseInt(scan.nextLine());

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(Integer.parseInt(scan.nextLine()));
        }

        System.out.print("Enter Limits:- ");
        int limit = Integer.parseInt(scan.nextLine());


        List<Integer> result =
                numbers.stream()
                        .filter(num -> num%2 == 0)
                        .distinct()
                        .sorted()
                        .limit(limit)
                        .toList();
        System.out.println("Even number:- " +result);


        scan.close();
    }
}
