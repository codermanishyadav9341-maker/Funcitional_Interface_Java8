package Sorted_StreamAPI;

import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> names = new ArrayList<>();

        System.out.println("Enter your characters:- ");
        for(int i = 0; i<size; i++){
            names.add(scan.nextLine());
        }

        System.out.println("Names List:- " +names);


        List<String> result =
                names.stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());


        System.out.println("Reverse Order:- " +result);


        scan.close();

    }
}
