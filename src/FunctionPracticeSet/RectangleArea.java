package FunctionPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BiFunction;

public class RectangleArea {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

           BiFunction<Double,Double,Double> areaRectangle = (length, breadth) -> length*breadth;

            System.out.print("Enter Length:- ");
            double length = scan.nextDouble();

            System.out.print("Enter Breadth:- ");
            double breadth = scan.nextDouble();

            System.out.println("Area of Rectangle:- " +areaRectangle.apply(length,breadth));

        }
        catch(InputMismatchException e){
            System.out.println("Please enter valid integer");
        }
    }
}
