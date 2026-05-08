package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Even {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input Size
        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        // users input Array
        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        // Stream()
        List<Integer> isEven =
                numbers.stream()
                        .filter(num -> num%2 == 0)
                        .collect(Collectors.toList());

        System.out.print("Even number:- " +isEven);



    }
}
