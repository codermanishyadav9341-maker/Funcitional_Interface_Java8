package LambdaPracticeSet;


import java.util.*;

@FunctionalInterface
public interface ElementList {
    void printList(List<Integer> size);
}
class Result10{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Size:- ");
            int size = scan.nextInt();

            if(size < 0){
                System.out.println("Size can be positive");
                return;
            }

            List<Integer> list = new ArrayList<>();

            System.out.println("Enter Array elements:- ");
            for(int i = 0; i<size; i++){
                list.add(scan.nextInt());
            }

            System.out.print("Array elements:- ");
            ElementList elementList = (number) ->{
               number.forEach(num -> System.out.print(num + " "));
            };
            elementList.printList(list);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}