package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Rectangle {
    void areaImpl(int length ,int breath);
}

class Result25{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Rectangle rr = (length,breath) ->{
            if((length >= 0) && (breath >= 0)){
                System.out.println("Area of Rectangle:- " +(length*breath));
            }
             else{
                 System.out.println("Length or breath cannot be negative");
            }
        };

        System.out.print("Enter your Length:- ");
        int length = scan.nextInt();

        System.out.print("Enter your breath:- ");
        int breath = scan.nextInt();

        rr.areaImpl(length,breath);

        scan.close();
    }
}