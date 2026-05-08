package Stream_Java8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Length {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> length = new ArrayList<>();

        System.out.println("Enter Name:- ");
        for(int i = 0; i<size; i++){
            length.add(scan.nextLine());
        }

        System.out.print("Names:- ");
        length.stream()
                .forEach(n->System.out.print(n+ ", "));

        System.out.print("\nLength:- ");
        length.stream()
                .map(String::length)
                .filter(len -> len > 4)
                .forEach(n->System.out.print(n+" "));
    }
}
