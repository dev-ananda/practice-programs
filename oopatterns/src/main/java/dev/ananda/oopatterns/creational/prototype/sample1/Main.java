package dev.ananda.oopatterns.creational.prototype.sample1;

public class Main {
	public static void main(String[] args) {
		System.out.println(EmployeeCache.getEmployee("ETPN1"));
		System.out.println(EmployeeCache.getEmployee("ETJN1"));
		System.out.println(EmployeeCache.getEmployee("ETMN1"));
	}
}
