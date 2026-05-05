package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Cube {
    void findCube(int a);
}

class Result16{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Cube cc = (a) ->{
            System.out.println("Volume of Cube:- " +(a*a*a));
        };

        System.out.print("Enter your side:- ");
        int a = scan.nextInt();

        cc.findCube(a);

        scan.close();

    }
}