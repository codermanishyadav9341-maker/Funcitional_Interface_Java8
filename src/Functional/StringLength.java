package Functional;

import java.util.Scanner;

@FunctionalInterface
public interface StringLength {
    void display(String str);
}

class Result3 implements StringLength{

    @Override
    public void display(String str){
        System.out.println("String Length is:- " +str.length());
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result3 r3 = new Result3();

        System.out.print("Enter Characters:- ");
        String str = scan.nextLine();

        r3.display(str);

        scan.close();
    }
}