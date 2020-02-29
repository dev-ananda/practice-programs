package dev.ananda.oopatterns.structural.filter.sample1;

public class Employee {
	private String name;
	private String gender;
	private String position;

	public Employee(String name, String gender, String position) {
		super();
		this.name = name;
		this.gender = gender;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getPosition() {
		return position;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", position=" + position + "]";
	}

}
