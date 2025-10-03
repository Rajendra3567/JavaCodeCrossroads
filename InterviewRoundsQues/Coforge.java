import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Coforge {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(50,100,70,40);

        Optional<Integer> secondLowest =
                salaries.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();
        System.out.println(secondLowest.get());

        List<Employee> employees = Arrays.asList(

        );

        List<Employee> sortedEmp =
                employees.stream()
                .sorted(
                        Comparator.comparing(Employee :: getName)
//                                .thenComparing(Employee::getDepartment)
                ).collect(Collectors.toList());

        // for each we can print
        sortedEmp.forEach(System.out::println);
    }
}
