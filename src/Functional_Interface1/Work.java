package Functional_Interface1;

@FunctionalInterface
public interface Work {
    void work();
}

class Test6 implements Work{

    @Override
    public void work(){
        System.out.println("Working........");
    }

    public static void main(String[] args){
        Work ww = new Test6();
        ww.work();

    }
}