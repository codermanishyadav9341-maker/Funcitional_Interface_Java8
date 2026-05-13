package AllMatch_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Password {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> password = new ArrayList<>();

        System.out.println("Enter Characters Password:- ");
        for(int i = 0; i<size; i++){
            password.add(scan.nextLine());
        }

        boolean result =
                password.stream()
                        .allMatch(str -> str.length() > 8);

        System.out.println("Password check:- " +result);

        scan.close();
    }
}
