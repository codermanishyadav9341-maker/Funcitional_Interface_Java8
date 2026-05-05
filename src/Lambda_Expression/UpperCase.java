package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface UpperCase {
    void check(String s);
}

class Result20{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        UpperCase up = (s) ->
                System.out.print("UpperCase:- " +s.toUpperCase());

        System.out.print("Enter your Character:- ");
        String s = scan.next();

        up.check(s);

        scan.close();

    }
}