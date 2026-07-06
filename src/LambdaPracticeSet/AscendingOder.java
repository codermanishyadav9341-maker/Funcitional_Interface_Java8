package LambdaPracticeSet;

import java.util.*;

@FunctionalInterface
public interface AscendingOder {
    void printAscending(List<Integer> num);
}
class Result17{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Size:- ");
            int size = scan.nextInt();

            if(size <= 0){
                System.out.println("Size can be positive");
                return;
            }

            List<Integer> list = new ArrayList<>();
            System.out.println("Enter Array elements:- ");
            for(int i = 0; i<size; i++){
                list.add(scan.nextInt());
            }

            AscendingOder ascendingOder = (number) -> {
                number.sort((a,b) -> a.compareTo(b));
                System.out.println("Ascending order:- " +number);
            };

            ascendingOder.printAscending(list);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}