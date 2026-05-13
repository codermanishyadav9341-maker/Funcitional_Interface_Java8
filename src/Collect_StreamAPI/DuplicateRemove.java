package Collect_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
public class DuplicateRemove {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        Set<Integer> result =
                numbers.stream()
                        .distinct()
                        .collect(Collectors.toSet());
        System.out.println("Duplicate Remove is:- " +result);

        scan.close();

    }
}
