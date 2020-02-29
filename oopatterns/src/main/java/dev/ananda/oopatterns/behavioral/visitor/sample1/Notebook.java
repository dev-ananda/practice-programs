package dev.ananda.oopatterns.behavioral.visitor.sample1;

public class Notebook implements Item {
	private int price;
	private int numberOfPages;

	public Notebook(int price, int numberOfPages) {
		super();
		this.price = price;
		this.numberOfPages = numberOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
