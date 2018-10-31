package com.marlabs.collections.examples;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAPIDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("SetAPIDemo Main Starts");

		// Set mainSet = new HashSet();
		// Set mainSet = new TreeSet();
		Set mainSet = new LinkedHashSet();
		boolean addFlag = mainSet.add("Deepti");
		// System.out.println("adding String " + addFlag);
		addFlag = mainSet.add("Deepti2");
		// System.out.println("adding String Deepti " + addFlag);
		addFlag = mainSet.add(new Customer("C101", "Deepti", 1000000009));
		// System.out.println("adding Customer Deepti " + addFlag);
		addFlag = mainSet.add(new Customer("C107", "Deepti2", 1000000007));
		// System.out.println("adding Customer Deepti2 " + addFlag);
		addFlag = mainSet.add(101);
		// System.out.println("adding integer " + addFlag);
		addFlag = mainSet.add(null);
		// System.out.println("adding null " + addFlag);
		// System.out.println(mainSet);

		Set<String> newStringSet = new TreeSet<String>();
		newStringSet.add("India");
		newStringSet.add("US");
		newStringSet.add("UK");
		// newStringSet.add(null);
		System.out.println("newStringSet: " + newStringSet);

		Customer customer1 = new Customer("C01", "Deepti", 10000009);
		Customer customer2 = new Customer("C02", "Sanjay", 10000007);
		Customer customer3 = new Customer("C03", "Dhammo", 10000001);
		Customer customer4 = new Customer("C04", "Partner", 10000001);
		Customer customer5 = new Customer("C05", "Jimit", 10000011);
		Customer customer6 = new Customer("C06", "Hitesh", 10000010);
		Customer customer8 = new Customer("C03", "Dhammo", 10000001);
		Customer customer7 = customer1;

		Set<Customer> customerSet = new TreeSet<Customer>();
		// Set<Customer> customerSet = new HashSet<Customer>();
		customerSet.add(customer1);
		customerSet.add(customer2);
		customerSet.add(customer3);
		customerSet.add(customer4);
		customerSet.add(customer5);
		customerSet.add(customer6);
		customerSet.add(customer7);
		customerSet.add(customer8);

		Iterator<Customer> iterator = customerSet.iterator();

		while (iterator.hasNext()) {
			System.out.println("Customer: " + iterator.next());
		}

		System.out.println("SetAPIDemo Main Ends");
	}

}
