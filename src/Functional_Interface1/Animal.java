package Functional_Interface1;

@FunctionalInterface
public interface Animal {
    void sound();
}

class Dog implements Animal{

    @Override
    public void sound(){
        System.out.println("Dogs bark......");
    }


    public static void main(String[] args){
        Animal aa = new Dog();
        aa.sound();

    }
}