package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Square {
    void sqImpl(int side);
}

class Result15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Square sq  = (side) -> {
            System.out.println("Square:- " +(side*side));
        };

        System.out.print("Enter your Side:- ");
        int side = scan.nextInt();

        sq.sqImpl(side);

        scan.close();

    }
}