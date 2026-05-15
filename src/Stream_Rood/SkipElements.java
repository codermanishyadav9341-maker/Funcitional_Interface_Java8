package Stream_Rood;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class SkipElements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.print("Enter Skip elements:- ");
        long skip = scan.nextLong();
        List<Integer> result =
                numbers.stream()
                        .skip(skip)
                        .toList();

        System.out.println("Skip After Elements:- " +result);

        scan.close();
    }
}
