package Lambda_Expression;

import java.util.Scanner;

@FunctionalInterface
public interface OddChecker {
    void check(int num);
}

class Result13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        OddChecker oc = (num) ->{
            if(num%2 != 0){
                System.out.println(num+ " is Odd number");
            }
             else{
                 System.out.println(num+ " is even number");
            }
        };

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        oc.check(num);

        scan.close();

    }
}