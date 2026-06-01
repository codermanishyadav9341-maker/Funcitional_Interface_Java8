package Lambda_Expression1;

import java.util.Scanner;
@FunctionalInterface
public interface EvenNumber {
    void even(int num);
}

class Result2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        EvenNumber ee = (num) -> {
            if(num% 2 == 0){
                System.out.println(num+ " is even number");
            }
             else{
                 System.out.println(num+ " is Odd number");
            }
        };

        System.out.print("Enter your numbers:- ");
        int num = scanner.nextInt();

        ee.even(num);

        scanner.close();

    }
}