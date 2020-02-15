package dev.ananda.stream.sample1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertThat;

public class StreamApp {

    private static Employee [] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100_000.0),
            new Employee(2, "Bill Gates", 200_000.0),
            new Employee(3, "Mark Zuckerberg", 300_000.0)
    };


    public static void main(String[] args) {

        //ways of creation

        Stream<Employee> emps = Stream.of(arrayOfEmps);

        List<Employee> empList = Arrays.asList(arrayOfEmps);

        emps = empList.stream();

        emps = Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);

        Stream.Builder<Employee> empStreamBuilder = Stream.builder();

        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);

        Stream<Employee> empStrem = empStreamBuilder.build();

        //Stream operations

        // forEach

        //empList.stream().forEach(e -> e.salaryIncrement(10.0));

        //emps.forEach(System.out::println);

        // map()

        EmployeeRepository employeeRepository = new EmployeeRepository(empList);

        Integer [] empIDs = {1, 2, 3};

        List<Employee> employees = Stream.of(empIDs)
                .map(employeeRepository::findById)
                .collect(Collectors.toList());

        employees.forEach(System.out::println);



    }

}
