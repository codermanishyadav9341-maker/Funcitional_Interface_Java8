package Functional_Interface1;

@FunctionalInterface
public interface StaticMethod {
    void show();

    static void info(){
        System.out.println("Static method");
    }
}

class Result20 implements StaticMethod{

    public void show(){
        System.out.println("Showing........");
    }

    public static void main(String[] args){
        StaticMethod sm = new Result20();
        StaticMethod.info();
        sm.show();

    }
}