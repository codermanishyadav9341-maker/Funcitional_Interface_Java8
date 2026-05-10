package Limit_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

        System.out.println("Original Value list:- " +list);

        System.out.print("Enter limits:- ");
        int limit = scan.nextInt();

        List<Integer> result =
                list.stream()
                        .distinct()
                        .sorted()
                        .limit(limit)
                        .toList();

        System.out.println("Limit number List:- " +result);

    }
}
