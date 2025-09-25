package programs.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDao {
    public static List<EmployeeDemo> getAllEmployee(){
        List<EmployeeDemo> list= new ArrayList<>();
        list.add(new EmployeeDemo(101,"khaja","moinuddin",900000));
        list.add(new EmployeeDemo(102,"pavan","mane",1000000));
        list.add(new EmployeeDemo(103,"venkatesh","jadhav",750000));
        list.add(new EmployeeDemo(104,"vijay","samdare",500000));
        list.add(new EmployeeDemo(105,"monica","patil",450000));
        return list;
    }

    public static void main(String[] args) {
        List<EmployeeDemo> list = getAllEmployee();
        EmployeeDemo employeeDemo = list.stream().sorted(Comparator.comparing(EmployeeDemo::getSalary).reversed()).findFirst().get();
        System.out.println(employeeDemo);

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(EmployeeDemo::getFirstName, Collectors.counting()));
        System.out.println(collect);

        Map<String, List<EmployeeDemo>> collect1 = list.stream().collect(Collectors.groupingBy(e -> {
            if (e.getSalary() >= 900000) return "high";
            else if (e.getSalary() >= 600000) return "medium";
            else return "low";
        }));
        System.out.println(collect1);
    }
}
