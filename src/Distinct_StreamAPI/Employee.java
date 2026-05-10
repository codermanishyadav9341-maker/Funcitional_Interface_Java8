package Distinct_StreamAPI;

import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Employee {
    String name;
    int id;

    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }


    @Override
    public boolean equals(Object o){
        Employee e = (Employee) o;
        return this.id == e.id;
    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public String toString(){
        return id + " - " + name;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<Employee> list = new ArrayList<>();

        for(int i = 0; i<size; i++){
            System.out.print("Enter Employee Name:- ");
            String name = scan.nextLine();

            System.out.print("Enter Employee ID:- ");
            int id = scan.nextInt();
            scan.nextLine();

            list.add(new Employee(name,id));
        }

        List<Employee> result =
                list.stream()
                        .distinct()
                        .sorted(Comparator.comparing(e-> e.id))
                        .toList();
        System.out.println("Employee list:- " +result);
    }
}
