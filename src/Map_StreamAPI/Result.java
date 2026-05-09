package Map_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Result {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.println("Original List:- " +numbers);

        List<String> stringList =
                numbers.stream()
                        .map(String::valueOf)
                        .collect(Collectors.toList());

        System.out.println("String list:- " +stringList);

    }
}
