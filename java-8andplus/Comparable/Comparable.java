package TopicWisePrograms.Java8Features.Comparable;

import java.util.ArrayList;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee( "Ravi",39));
        employeeList.add(new Employee( "Sai",28));
        employeeList.add(new Employee( "Hari",31));

        for (Employee emp:employeeList) {
            System.out.println(emp);
        }
    }

}
