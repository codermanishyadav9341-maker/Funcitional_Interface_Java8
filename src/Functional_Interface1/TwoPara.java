package Functional_Interface1;

import java.util.Scanner;

@FunctionalInterface
public interface TwoPara {
    void show(int a,int b);
}

class Test20 implements TwoPara{

    @Override
    public void show(int a,int b){
        System.out.println("Value of a:- " +a+ "\nValue of b:- " +b);
    }

    public static void main(String[] args){
        TwoPara tp = new Test20();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:-  ");
        int b = scan.nextInt();

        tp.show(a,b);


    }
}