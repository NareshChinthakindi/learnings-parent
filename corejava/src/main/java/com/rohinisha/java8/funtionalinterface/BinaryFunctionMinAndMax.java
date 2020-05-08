package com.rohinisha.java8.funtionalinterface;

import com.rohinisha.model.Employee;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryFunctionMinAndMax {

    public static void main(String[] args) {


        Employee emp1 = new Employee("Naresh1", new BigDecimal(23.5));
        Employee emp2 = new Employee("Naresh2", new BigDecimal(23.5));
        Employee emp3 = new Employee("Naresh3", new BigDecimal(13.5));
        Employee emp4 = new Employee("Naresh4", new BigDecimal(23.5));
        Employee emp5 = new Employee("Naresh5", new BigDecimal(53.5));


        List<Employee> list = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        // 1. Create a Comparator
        Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);

        // 2. BinaryOperator with a custom Comparator
        BinaryOperator<Employee> bo = BinaryOperator.maxBy(comparing);

        Employee result = find(list, bo);

        System.out.println(result);     // Developer{name='jaden', salary=10000}

        // one line

        // find developer with highest pay
        Employee employee = find(list, BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(employee);

        // find developer with lowest pay
        Employee employee2 = find(list, BinaryOperator.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(employee2);


    }

    private static Employee find(List<Employee> list, BinaryOperator<Employee> accumulator) {
        Employee result = null;
        for (Employee t : list) {
            if (result == null) {
                result = t;
            } else {
                result = accumulator.apply(result, t);
            }
        }
        return result;
    }

}
