package Stream_Java8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class LowerCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scanner.nextInt();
        scanner.nextLine();

        List<String> names = new ArrayList<>();

        System.out.println("Enter Student names:- ");
        for(int i = 0; i<size; i++){
            names.add(scanner.nextLine());
        }

        System.out.print("Student Name:- ");
        names.stream()
                .forEach(n->System.out.print(n+ " "));


        System.out.print("\nLowerCase:- ");
        names.stream()
                .map(String::toLowerCase)
                .forEach(n->System.out.print(n+ " "));

        scanner.close();

    }
}
