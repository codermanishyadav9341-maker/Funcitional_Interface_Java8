package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface CubeNumber {
    void printCube(int num);
}
class Result5{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            CubeNumber cube = (num) -> {
                System.out.println("Cube:- " +(num*num*num));
            };

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            cube.printCube(num);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}