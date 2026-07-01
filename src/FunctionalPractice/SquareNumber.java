package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface SquareNumber {
    void printSquare(int num);
}

class SquareImpl implements SquareNumber{

    @Override
    public void printSquare(int num){
        double result = Math.sqrt(num);
        System.out.println("Square:- " +result);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        SquareNumber square = new SquareImpl();
        square.printSquare(num);
    }
}