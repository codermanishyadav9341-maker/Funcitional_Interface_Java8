package Map_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> names = new ArrayList<>();

        System.out.println("Enter Student name:- ");
        for(int i = 0; i<size; i++){
            names.add(scan.nextLine());
        }

        System.out.println("Student List:- " +names);

        List<String> result =
                names.stream()
                        .map(str -> new StringBuilder(str).reverse().toString())
                        .collect(Collectors.toList());

        System.out.println("Reverse elements:- " +result);


    }
}
