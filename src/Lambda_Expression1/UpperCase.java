package Lambda_Expression1;

import java.util.Scanner;
@FunctionalInterface
public interface UpperCase {
    void isLetter(String str);
}

class Result3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        UpperCase letter = (str) -> {
            str.toUpperCase();
            System.out.println("Convert UpperCase:- " +str.toUpperCase());
        };

        System.out.println("Enter Characters:- ");
        String str = scan.nextLine();

        letter.isLetter(str);
    }
}
