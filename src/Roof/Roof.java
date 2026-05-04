package Roof;

@FunctionalInterface
  interface So{
      void Show();
  }

class Main{

  public static void main(String[] args) {

      So sp = () -> System.out.println("Hello Custom Interface");

    sp.Show();

  }
}