package BasicStreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Divisible {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        long result =
                numbers.stream()
                        .filter(num -> num%2 == 0)
                        .count();

        System.out.println("EvenNumber Count is:- " +result);

        scan.close();
    }
}
