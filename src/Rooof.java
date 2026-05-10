
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

class Employee12 {
    int id;
    String name;

    Employee12(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

 class Q26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        List<Employee12> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter id: ");
            int id = sc.nextInt();

            System.out.print("Enter name: ");
            String name = sc.next();

            list.add(new Employee12(id, name));
        }

        List<Employee12> res = list.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(
                                e -> e.id,
                                e -> e,
                                (a, b) -> a   // duplicate id me first ko rakhega
                        ),
                        m -> new ArrayList<>(m.values())
                ));

        System.out.println("\nAfter removing duplicate IDs:");
        res.forEach(e -> System.out.println(e.id + " " + e.name));
    }
}
