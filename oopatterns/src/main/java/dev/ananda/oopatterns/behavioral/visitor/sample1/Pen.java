package dev.ananda.oopatterns.behavioral.visitor.sample1;

public class Pen implements Item {

	private int price;
	private String model;

	public Pen(int price, String model) {
		super();
		this.price = price;
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
