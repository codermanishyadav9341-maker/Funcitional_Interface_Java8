package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface AbsoluteNumber {
    void printAbsolute(int num);
}

class AbsoluteImpl  implements AbsoluteNumber{
    @Override
    public void printAbsolute(int num){
        int result = Math.abs(num);
        System.out.println("Absolut number is:- " +result);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number is:- ");
        int num = scan.nextInt();

        AbsoluteNumber  absolute = new AbsoluteImpl();
        absolute.printAbsolute(num);


        scan.close();
    }
}