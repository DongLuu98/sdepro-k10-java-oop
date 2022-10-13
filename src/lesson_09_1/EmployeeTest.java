package lesson_09_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FTE();
        Employee e2 = new Contractor();

        List<Employee> employeeList = Arrays.asList(e1,e2);

        int totalSalary = new EmployeeController().calculateTotalSalary(employeeList);
        System.out.println("Total: " +totalSalary);
    }
}
