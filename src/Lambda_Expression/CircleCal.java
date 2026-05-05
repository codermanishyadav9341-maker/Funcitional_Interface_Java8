package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface CircleCal {
    void areaImpl(int radius);
}

class Result26{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        CircleCal cl = (radius) ->{
            if(radius >= 0){
                System.out.println("Area of Circle:- " +(Math.PI*radius*radius));
            }
             else{
                 System.out.println("Radius cannot be negative");
            }
        };

        System.out.print("Enter Radius:- ");
        int radius = scan.nextInt();

        cl.areaImpl(radius);

        scan.close();

    }
}