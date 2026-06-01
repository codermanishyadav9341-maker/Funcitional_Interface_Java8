package Functional;

@FunctionalInterface
public interface So {
    void display();
}

class Result1 implements So{

    @Override
    public void display(){
        System.out.println("Hello Functions");
    }

    public static void main(String[] args){
        Result1 rr = new Result1();
        rr.display();
    }
}