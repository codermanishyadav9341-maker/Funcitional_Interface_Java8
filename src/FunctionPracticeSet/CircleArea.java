package FunctionPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;
public class CircleArea {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Function<Integer,Double>  areaCircle = (radius) -> Math.PI*radius*radius;


            System.out.print("Enter Radius:- ");
            int radius = scan.nextInt();

            System.out.println("Area of circle:- " +areaCircle.apply(radius));
        }
        catch (InputMismatchException e){
            System.out.println("Please enter valid integer");
        }
    }
}
