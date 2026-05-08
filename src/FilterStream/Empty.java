package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Empty {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letter = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            letter.add(scan.nextLine());
        }

        System.out.print("Word:- ");
        letter.stream()
                .forEach(n->System.out.print(n+ " "));


//        Stream perform
        List<String> empty =
                letter.stream()
                        .filter(str -> str.isEmpty())
                        .collect(Collectors.toList());


        System.out.print("\nEmpty Space:- " +empty);

    }
}
