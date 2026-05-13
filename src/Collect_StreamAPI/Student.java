package Collect_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
public class Student {
    String name;
    int id;

    Student(String name,int id){
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<Student> letters = new ArrayList<>();

        for(int i = 0; i<size; i++){
            System.out.print("Enter Student Name:- ");
            String name = scan.nextLine();

            System.out.print("Enter Student ID:- ");
            int id = scan.nextInt();
            scan.nextLine();

            letters.add(new Student(name,id));
        }

        Map<String,Integer> result =
                letters.stream()
                        .collect(Collectors.toMap(s->s.name,s->s.id));

        System.out.println("Student Details:- " +result);

        scan.close();
    }
}
