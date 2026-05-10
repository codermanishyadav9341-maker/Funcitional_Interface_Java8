package Skip_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class SkipFirstDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.print("Enter Skip numbers:- ");
        long skip = scan.nextLong();

        List<Integer> result =
                numbers.stream()
                        .sorted()
                        .distinct()
                        .skip(skip)
                        .toList();

        System.out.println("After Skip Remaining elements:- " +result);

        scan.close();
    }
}
