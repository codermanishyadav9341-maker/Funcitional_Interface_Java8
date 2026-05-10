package Limit_StreamAPI;

import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Salary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = Integer.parseInt(scan.nextLine());

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(Integer.parseInt(scan.nextLine()));
        }

        System.out.print("Enter limit:- ");
        int limit = Integer.parseInt(scan.nextLine());

        List<Integer> result =
                numbers.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .limit(limit)
                        .toList();

        System.out.println("Descending Order:- " +result);

        scan.close();
    }
}
