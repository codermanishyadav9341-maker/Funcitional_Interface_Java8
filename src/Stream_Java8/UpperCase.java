package Stream_Java8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class UpperCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scanner.nextInt();
        scanner.nextLine();   // Buffer

        List<String> names = new ArrayList<>();

        System.out.println("Enter Student names:- ");
        for(int i = 0; i<size; i++){
            names.add(scanner.nextLine());
        }

        System.out.print("Student name:- ");
        names.stream()
                .forEach(n->System.out.print(n+ " , "));



        System.out.print("\nUpperCase:- ");
        names.stream()
                .map(String::toUpperCase)
                .forEach(n->System.out.print(n+ ","));



        scanner.close();

    }
}
