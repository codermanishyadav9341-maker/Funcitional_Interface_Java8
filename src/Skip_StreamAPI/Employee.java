package Skip_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Employee {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> names = new ArrayList<>();

        System.out.println("Enter Employee Names:- ");
        for(int i = 0; i<size; i++){
            names.add(scan.nextLine());
        }


        System.out.print("Enter Limit:- ");
        int limit = scan.nextInt();

        System.out.print("Enter Skip number:- ");
        long skip = scan.nextLong();

        List<String> result =
                names.stream()
                        .sorted()
                        .distinct()
                        .skip(skip)
                        .limit(limit)
                        .toList();

        System.out.println("Employee Names List is:- " +result);

        scan.close();

    }
}
