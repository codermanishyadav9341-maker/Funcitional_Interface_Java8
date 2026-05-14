package NoneMatch_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EvenNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        boolean result =
                numbers.stream()
                        .noneMatch(num -> num%2 == 0);

        System.out.println("No even number present is:- " +result);
        scan.close();
    }
}
