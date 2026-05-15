package Stream_Rood;

import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DescendingOrder {
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
                        .sorted(Comparator.reverseOrder())
                        .toList();

        System.out.println("Descending Order:- " +result);

        scan.close();
    }
}
