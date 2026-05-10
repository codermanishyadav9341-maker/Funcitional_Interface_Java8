package Limit_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class EmployeeSalary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> salary = new ArrayList<>();

        System.out.println("Enter Employee Salary:- ");
        for(int i = 0; i<size; i++){
            salary.add(scan.nextInt());
        }

        System.out.print("Enter Limit:- ");
        int limit  = scan.nextInt();

        List<Integer> result =
                salary.stream()
                        .filter(num -> num > 50000)
                        .distinct()
                        .sorted()
                        .limit(limit)
                        .toList();

        System.out.println("Employee earning above50000 is:- " +result);


        scan.close();
    }
}
