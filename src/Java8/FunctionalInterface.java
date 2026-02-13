package Java8;

@java.lang.FunctionalInterface
interface FunctionalInterface {
    void run();

    default void eat(){
        System.out.println("Eating....");
    }

    default void sat(){
        System.out.println("Eating....");
    }
}




class Main implements FunctionalInterface{
    public void run() {
        System.out.println("Running");
    }

    static void sleep(){
        System.out.println("Sleeping");
    }



    public static void main(String[] args){
        Main mm = new Main();
        mm.run();
        sleep();
        mm.eat();

    }

}
