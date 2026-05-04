package Functional_Interface1;

@FunctionalInterface
public interface Test1 {
    void display();
}

class Test2 implements Test1{

    @Override
    public void display(){
        System.out.println("Hello Mainsh");
    }

    public static void main(String[] args){
        Test1 tt = new Test2();
        tt.display();

    }
}
