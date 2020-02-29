package dev.ananda.oopatterns.creational.prototype.sample1;

public abstract class Employee implements Cloneable {

	private String id;
	protected String position;
	private String name;
	private String address;
	private double wage;

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return clone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
	abstract void work();

	@Override
	public String toString() {
		return "Employee [id=" + id + ", position=" + position + ", name=" + name + ", address=" + address + ", wage="
				+ wage + "]";
	}
	
	

}
