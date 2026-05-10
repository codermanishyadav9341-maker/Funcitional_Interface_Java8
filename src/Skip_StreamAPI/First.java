package Skip_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class First {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.print("Enter Limit:- ");
        int limit = scan.nextInt();

        System.out.print("Enter elements Skip:-");
        long num = scan.nextLong();

        List<Integer> result =
                numbers.stream()
                        .sorted()
                        .distinct()
                        .limit((limit))
                        .skip(num)
                        .toList();


        System.out.println("Numbers List:- " +result);

        scan.close();
    }
}
