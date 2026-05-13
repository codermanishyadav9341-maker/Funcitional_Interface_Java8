package AllMatch_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Marks {
    String name;
    int marks;

    Marks(String name,int marks){
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<Marks> list = new ArrayList<>();

        for(int i = 0; i<size; i++){
            System.out.print("Enter Student Name:- ");
            String name = scan.nextLine();

            System.out.print("Enter Marks:- ");
            int marks = scan.nextInt();
            scan.nextLine();

            list.add(new Marks(name,marks));
        }

        boolean result =
                list.stream()
                        .allMatch(num -> num.marks > 35);

        System.out.println("Passed Marks > 35:- " +result);
        scan.close();
    }
}
