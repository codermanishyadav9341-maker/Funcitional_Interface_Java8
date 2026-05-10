package Distinct_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Student {
    String name;
    int id;

    Student(String name,int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        Student ss = (Student) o;
        return this.id == ss.id;
    }

    @Override
    public int hashCode(){
        return id;
    }

    public String toString(){
        return id+ " " +name;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();


        List<Student> list = new ArrayList<>();

        for(int i = 0; i<size; i++){
            System.out.print("Enter Student Name:- ");
             String name = scan.nextLine();

             System.out.print("Enter Student ID:- ");
             int id = scan.nextInt();
             scan.nextLine();

             list.add(new Student(name,id));
        }


        List<Student> result =
                list.stream()
                        .distinct()
                        .toList();

        System.out.println("Student List:- " +result);

    }
}
