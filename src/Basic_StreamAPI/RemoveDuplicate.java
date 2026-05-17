package Basic_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class RemoveDuplicate {
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
                        .distinct()
                        .sorted()
                        .toList();

        System.out.println("Remove Duplicate:- " +result);

        scan.close();

    }
}
