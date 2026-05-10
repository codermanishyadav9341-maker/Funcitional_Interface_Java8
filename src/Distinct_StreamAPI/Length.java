package Distinct_StreamAPI;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Length {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letters = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        List<Integer> result =
                letters.stream()
                        .map(String::length)
                        .distinct()
                        .toList();

        System.out.println("String length:- " +result);

        scan.close();
    }
}
