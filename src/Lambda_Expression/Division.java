package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Division {
    void divImpl(int a,int b);
}

class Result10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Division dd = (a,b) ->
                System.out.println("Division:- " +(a/b));

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        dd.divImpl(a,b);

        scan.close();
    }
}