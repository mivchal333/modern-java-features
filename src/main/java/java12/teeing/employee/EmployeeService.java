package java12.teeing.employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    double getAvgEmployeeSalary(List<Employee> employees) {
        // implement here
        // use List::stream method
        return employees.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(e -> e.getSalary()),
                        Collectors.counting(),
                        (sum, count) -> sum / count
                ));
    }
}
