package Stream_Java8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Positive {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> number = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            number.add(scan.nextInt());
        }

        List<Integer> positive =  number.stream()
                .filter(n-> n>0)
                .collect(Collectors.toList());

        System.out.print("Positive number:- " +positive);


    }
}
