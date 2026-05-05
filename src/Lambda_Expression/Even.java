package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Even{
    void evenImpl(int num);
}

class Result11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Even ee = (num) ->{
            if(num%2 == 0){
                System.out.println(num+ " is even number");
            }
             else{
                 System.out.println(num+ " is odd number");
            }
        };

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        ee.evenImpl(num);

        scan.close();

    }
}