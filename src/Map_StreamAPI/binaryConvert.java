package Map_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class binaryConvert {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.println("Original number:- " +numbers) ;

        List<String> result =
                numbers.stream()
                        .map(Integer::toBinaryString)
                        .collect(Collectors.toList());


        System.out.println("Binary number:- " +result);

    }
}
