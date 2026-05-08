package Stream_Java8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Elements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter your elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

        // Stream Syntax

        System.out.print("Stream elements:- ");
        list.stream()
                .forEach(n ->System.out.print(n+ " "));

        scan.close();

    }
}
