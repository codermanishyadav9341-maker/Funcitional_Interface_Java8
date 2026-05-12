package ForEach_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class OddNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.print("Odd number is:- ");
        numbers.stream()
                .filter(num-> num%2 != 0)
                .forEach(n->System.out.print(n+ " "));

        scan.close();
    }
}
