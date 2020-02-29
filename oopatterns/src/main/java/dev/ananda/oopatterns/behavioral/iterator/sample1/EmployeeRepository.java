package dev.ananda.oopatterns.behavioral.iterator.sample1;

public class EmployeeRepository implements Sector {

	public String[] employees = {"David", "Scott", "Rhet", "Andrew", "Jessica"};
	
	@Override
	public Iterator<String> getIterator() {
		return new EmployeeIterator();
	}
	
	private class EmployeeIterator implements Iterator<String> {

		int index;
		
		@Override
		public boolean hasNext() {
			if(index < employees.length){
				return true;
			}
			return false;
		}

		@Override
		public String next() {
			if(this.hasNext()){
				return employees[index++];
			}
			return null;
		}

	}

}
