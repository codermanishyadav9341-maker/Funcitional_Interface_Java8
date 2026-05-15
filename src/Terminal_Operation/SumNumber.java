package Terminal_Operation;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class SumNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        int result =
                numbers.stream()
                        .reduce(0,(a,b) -> a+b);

        System.out.println("Sum:- " +result);

        scan.close();
    }
}
