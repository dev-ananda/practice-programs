package dev.ananda.oopatterns.behavioral.iterator.sample1;

public class Main {
	public static void main(String[] args) {
		EmployeeRepository repository = new EmployeeRepository();
		
		Iterator<String> emp = repository.getIterator();

		while(emp.hasNext()){
			System.out.println(emp.next());
		}
	}
	
}
