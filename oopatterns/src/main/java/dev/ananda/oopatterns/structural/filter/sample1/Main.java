package dev.ananda.oopatterns.structural.filter.sample1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		// adding employees to the list
		employeeList.add(new Employee("David", "Male", "Senior"));
		employeeList.add(new Employee("Scott", "Male", "Senior"));
		employeeList.add(new Employee("Rhett", "Male", "Junior"));
		employeeList.add(new Employee("Andrew", "Male", "Junior"));
		employeeList.add(new Employee("Susan", "Female", "Senior"));
		employeeList.add(new Employee("Rebecca", "Female", "Junior"));
		employeeList.add(new Employee("Mary", "Female", "Junior"));
		employeeList.add(new Employee("Juliette", "Female", "Senior"));
		employeeList.add(new Employee("Jessica", "Female", "Junior"));
		employeeList.add(new Employee("Mike", "Male", "Junior"));
		employeeList.add(new Employee("Chris", "Male", "Junior"));

		// initialization of the different criteria classes
		Criteria maleEmployees = new CriteriaMale();
		Criteria femaleEmployees = new CriteriaFemale();
		Criteria seniorEmployees = new CriteriaSenior();
		Criteria juniorEmployees = new CriteriaJunior();
		// AndCriteria and OrCriteria accept two Criteria as their constructor
		// arguments and return filtered lists
		Criteria seniorFemale = new AndCriteria(seniorEmployees, femaleEmployees);
		Criteria juniorOrMale = new OrCriteria(juniorEmployees, maleEmployees);

		System.out.println("Male employees: ");
		maleEmployees.filter(employeeList).forEach(System.out::println);

		System.out.println("\nFemale employees: ");
		femaleEmployees.filter(employeeList).forEach(System.out::println);

		System.out.println("\nSenior female employees: ");
		seniorFemale.filter(employeeList).forEach(System.out::println);

		System.out.println("\nJunior or male employees: ");
		juniorOrMale.filter(employeeList).forEach(System.out::println);
	}
}
