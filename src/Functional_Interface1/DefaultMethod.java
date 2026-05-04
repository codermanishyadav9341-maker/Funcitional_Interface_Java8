package Functional_Interface1;

@FunctionalInterface
public interface DefaultMethod {
    void run();

    default void display(){
        System.out.println("Default method");
    }
}

class Result18 implements DefaultMethod{

    @Override
    public void run(){
        System.out.println("Running..........");
    }

    public static void main(String[] args){
        DefaultMethod dm = new Result18();
        dm.display();
        dm.run();

    }
}