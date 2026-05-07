package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class Circle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<Double,Double> area = radius -> Math.PI*radius*radius;

        System.out.print("Enter Radius:- ");
        double radius = scan.nextDouble();

        System.out.println("Area of Circle:- " +area.apply(radius));

        scan.close();



    }
}
