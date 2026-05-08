package Stream_Java8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Even{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter Array elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

        System.out.print("Array Elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(list.get(i) +" ");
        }

        System.out.print("\nEven number:- ");
           list.stream()
                   .filter(num -> num%2 == 0)
                   .forEach(n ->System.out.print(n+ " "));


    }
}