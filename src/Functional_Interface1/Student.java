package Functional_Interface1;

@FunctionalInterface
public interface Student {
    void study();
}

class TeacherImpl implements Student{

    @Override
    public void study(){
        System.out.println("Teaching........");
    }

    public static void main(String[] args){
        Student ss = new TeacherImpl();
        ss.study();
    }
}