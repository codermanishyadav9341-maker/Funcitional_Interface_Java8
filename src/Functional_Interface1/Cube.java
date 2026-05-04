package Functional_Interface1;

import java.util.Scanner;

@FunctionalInterface
public interface Cube {
    void cube(int side);
}

class Result30 implements Cube{

    @Override
    public void cube(int side){
        System.out.println("Cube:- " +(side*side*side));
    }

    public static void main(String[] args){
        Cube cc = new Result30();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your side:- ");
        int side = scan.nextInt();

        cc.cube(side);

        scan.close();

    }

}