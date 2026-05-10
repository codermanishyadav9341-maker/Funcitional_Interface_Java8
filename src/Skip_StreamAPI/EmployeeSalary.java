package Skip_StreamAPI;

import java.util.Comparator;
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

        System.out.print("Enter Skip elements:- ");
        long skip = scan.nextLong();

        List<Integer> result =
                salary.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(skip)
                        .toList();

        System.out.println("Skip 3 highest Salary After Remaining Salary:- " +result);

        scan.close();

    }
}
