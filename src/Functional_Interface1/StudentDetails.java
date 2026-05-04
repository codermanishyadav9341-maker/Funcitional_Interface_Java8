package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface StudentDetails {
    void details(String name,int id);
}

class Result5 implements StudentDetails{

    @Override
    public void details(String name,int id){
        if(name == null || name.isEmpty()) {
            System.out.println("Invalid Student name!");
        }
         else{
            System.out.println("Student Name:- " + name);
        }
        if(id >= 0) {
            System.out.println("Id no:- " + id);
        }
         else{
             System.out.println("Student id cannot be negative");
        }
    }

    public static void main(String[] args){
        StudentDetails sd = new Result5();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Student Name:- ");
        String name =scan.nextLine();

        System.out.print("Enter Student ID:- ");
        int id = scan.nextInt();

        sd.details(name,id);

        scan.close();
    }
}