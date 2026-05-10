package Limit_StreamAPI;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class UniqueElements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.print("Enter Limit:- ");
        int limit = scan.nextInt();

        List<Integer> result =
                numbers.stream()
                        .distinct()
                        .limit(limit)
                        .toList();

        System.out.println("Unique number List:- " +result);

        scan.close();
    }
}
