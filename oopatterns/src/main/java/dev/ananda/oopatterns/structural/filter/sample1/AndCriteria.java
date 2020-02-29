package dev.ananda.oopatterns.structural.filter.sample1;

import java.util.List;

public class AndCriteria implements Criteria {
	private Criteria criteria1;
	private Criteria criteria2;

	public AndCriteria(Criteria criteria1, Criteria criteria2) {
		super();
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	@Override
	public List<Employee> filter(List<Employee> employees) {
		return criteria2.filter(criteria1.filter(employees));
	}

}
