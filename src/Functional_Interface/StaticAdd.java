package Functional_Interface;

@FunctionalInterface
public interface StaticAdd {
    void day();

    static void sleep(){
        System.out.println("Sleeping..........");
    }
}

class Result17 implements StaticAdd{

    public void day(){
        System.out.println("Monday");
    }

    public static void main(String[] args){
        Result17 rr = new Result17();

        rr.day();
        StaticAdd.sleep();
    }
}
