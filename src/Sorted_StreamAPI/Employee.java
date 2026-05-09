package Sorted_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Employee{
    String name;
    int salary;

    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<Employee> employeeList = new ArrayList<>();
        for(int i = 0; i<size; i++){
            System.out.print("Enter Employee Name:- ");
            String name = scan.nextLine();

            System.out.print("Enter Employee Salary:- ");
            int salary = scan.nextInt();
            scan.nextLine();

            employeeList.add(new Employee(name,salary));
        }

        List<Employee> result =
                employeeList.stream()
                        .sorted()
                        .collect(Collectors.toList());

                System.out.println("Employee List:- " +result) ;

    }
}
