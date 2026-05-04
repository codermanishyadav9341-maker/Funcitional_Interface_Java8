package Functional_Interface1;

@FunctionalInterface
public interface Vehicle {
    void start();
}

class Car implements Vehicle{

    @Override
    public void start(){
        System.out.println("Car is Running.......");
    }

    public static void main(String[] args){
        Vehicle cc = new Car();
        cc.start();

    }
}