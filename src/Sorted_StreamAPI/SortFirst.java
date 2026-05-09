package Sorted_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class SortFirst {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letters = new ArrayList<>();

        System.out.println("Enter your Words:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        System.out.println("String List:- " +letters);

        List<String> result =
                letters.stream()
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println("Names List:- " +result);


    }
}
