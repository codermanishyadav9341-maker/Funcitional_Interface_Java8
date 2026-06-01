package Predicate1;

import java.util.Scanner;
import java.util.function.Predicate;
public class EmptyCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        String str = scan.nextLine();

        Predicate<String> isEmpty = st -> st.isEmpty();

        System.out.println("Empty Check is:- " +isEmpty.test(str));


        scan.close();
    }
}
