package Stream_Java8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Limit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> number = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            number.add(scan.nextInt());
        }

        System.out.print("Array elements:- ");
        number.stream()
                .forEach(n->System.out.print(n+ " "));

        System.out.print("\nSkip elements:- ");
        long skipValue = scan.nextLong();

        System.out.print("\nBacha Elements:- ");
                number.stream()
                        .skip(skipValue)
                        .forEach(n->System.out.print(n+ " "));



                scan.close();

    }
}
