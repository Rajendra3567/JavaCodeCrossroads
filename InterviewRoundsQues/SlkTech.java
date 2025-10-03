import java.util.*;
import java.util.stream.Collectors;

public class SlkTech {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Ram", 20),
            new Employee(2, "Shyam", 25),
            new Employee(3, "Jack", 28),
            new Employee(1, "john", 35)
        );

        Map<Integer, Employee> employeeMap =
                employees.stream()
                        .sorted(
                                Comparator.comparingInt(Employee::getAge)
                        ).collect(Collectors.toMap(
                                Employee::getId,
                                e -> e,
                                (e1,e2) -> e1,
                                LinkedHashMap::new
                        ));
        System.out.println(employeeMap);
    }
}
