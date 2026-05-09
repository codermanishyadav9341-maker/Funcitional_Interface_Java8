package Map_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Square {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();


        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }


        //Input Display
        System.out.println("Original List:- " +numbers);

        // stream processing
        List<Integer> squareNumber =
                numbers.stream()
                        .map( num -> num*num)
                        .collect(Collectors.toList());


        // OutPut Display
        System.out.println("Square Array List:- " +squareNumber);


        scan.close();
    }
}
