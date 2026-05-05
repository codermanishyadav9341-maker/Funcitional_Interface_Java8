package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Sum {
    int isSum(int a,int b);
}

class Result40{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Sum sm = (a,b) ->{
            System.out.println("Sum of a and b is:- " +(a+b));
            return a+b;
        };

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        sm.isSum(a,b);

        scan.close();

    }
}
