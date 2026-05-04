package Functional_Interface1;

public interface Demo {
    void run();
}

class Test5 implements Demo{

    public void run(){
        System.out.println("Running......");
    }

    public static void main(String[] args){
        Demo dd = new Test5();
        dd.run();
    }
}