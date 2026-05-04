package Functional_Interface1;

@FunctionalInterface
public interface Mobile {
    void call();
}

class Phone implements Mobile{

    @Override
    public void call(){
       System.out.println("Calling.......");
    }

    public static void main(String[] args){
        Mobile mp = new Phone();
        mp.call();

    }
}