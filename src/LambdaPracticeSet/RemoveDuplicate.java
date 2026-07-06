package LambdaPracticeSet;

import java.util.*;

@FunctionalInterface
public interface RemoveDuplicate {
    void printRemove(List<Integer> num);
}
class Result19{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Size:- ");
            int size = scan.nextInt();

            if(size <= 0){
                System.out.println("Size must be positive");
                return;
            }

            List<Integer> list = new ArrayList<>();

            System.out.println("Enter Array elements:- ");
            for(int i = 0; i<size; i++){
                list.add(scan.nextInt());
            }

            //lambda
            RemoveDuplicate removeDuplicate = (number) ->{
                Set<Integer> set = new HashSet<>();
                number.removeIf(num -> !set.add(num));
                System.out.println("Remove duplicate elements:-  " +number);
            };

           removeDuplicate.printRemove(list);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}