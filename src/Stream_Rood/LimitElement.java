package Stream_Rood;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class LimitElement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.print("Enter Limits:- ");
        int limit = scan.nextInt();

        List<Integer> result =
                numbers.stream()
                        .limit(limit)
                        .toList();

        System.out.println("Elements:- " +result);

        scan.close();
    }
}
