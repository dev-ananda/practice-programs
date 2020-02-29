package dev.ananda.oopatterns.structural.filter.sample1;

import java.util.List;

public interface Criteria {
	List<Employee> filter(List<Employee> employees);
}
