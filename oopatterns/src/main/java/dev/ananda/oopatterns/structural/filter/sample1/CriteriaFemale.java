package dev.ananda.oopatterns.structural.filter.sample1;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Employee> filter(List<Employee> employees) {
		return employees.stream().filter(e -> e.getGender().equals("Female"))
				.collect(Collectors.toList());
	}

}
