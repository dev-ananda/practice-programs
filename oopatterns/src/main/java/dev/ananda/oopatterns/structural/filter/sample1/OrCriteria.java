package dev.ananda.oopatterns.structural.filter.sample1;

import java.util.List;

public class OrCriteria implements Criteria {
	private Criteria criteria1;
	private Criteria criteria2;

	public OrCriteria(Criteria criteria1, Criteria criteria2) {
		super();
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	@Override
	public List<Employee> filter(List<Employee> employees) {
		List<Employee> finalEmployees = criteria1.filter(employees);
		criteria2.filter(employees).stream().forEach(e -> {
			if (!finalEmployees.contains(e)) {
				finalEmployees.add(e);
			}
		});
		return finalEmployees;
	}

}
