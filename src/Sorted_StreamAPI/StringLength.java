package Sorted_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class StringLength {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> names = new ArrayList<>();

        System.out.println("Enter your Words:- ");
        for(int i = 0; i<size; i++){
            names.add(scan.nextLine());
        }

        List<String> result =
                names.stream()
                        .sorted((a,b) ->a.length() - b.length())
                        .collect(Collectors.toList());

        System.out.println("String length:- " +result);

    }
}
