package Stream_Rood;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PositiveNumber {
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
                        .filter(num -> num > 0)
                        .toList();

        System.out.println("Positive Number is:- " +result);

        scan.close();
    }
}
