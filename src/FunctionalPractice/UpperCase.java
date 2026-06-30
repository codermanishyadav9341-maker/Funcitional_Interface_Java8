package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface UpperCase {
    void printUpperCase(String str);
}

class UpperCaseImpl implements UpperCase{
    @Override
    public void printUpperCase(String str){
        System.out.println("UpperCase:- " +str.toUpperCase());
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Character:- ");
        String str = scan.nextLine();

        UpperCaseImpl upperCase = new UpperCaseImpl();
        upperCase.printUpperCase(str);

        scan.close();
    }
}