package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface Cube {
    void printCube(int number);
}

class CubeImpl implements Cube{

    @Override
    public void printCube(int number){
        System.out.println("Cube:- " +(number * number * number));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:- ");
        int side = scan.nextInt();

        Cube cube = new CubeImpl();
        cube.printCube(side);

        scan.close();
    }
}