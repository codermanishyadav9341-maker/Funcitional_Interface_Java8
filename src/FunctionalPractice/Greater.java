package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface Greater {
    void checkGreater(int num);
}

class GreaterImpl implements Greater{

    @Override
    public void checkGreater(int num){
        System.out.println("Greater > 10 is:- " +(num > 10));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        Greater greater = new GreaterImpl();
        greater.checkGreater(num);

        scan.close();
    }
}