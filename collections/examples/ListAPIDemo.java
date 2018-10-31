package com.marlabs.collections.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListAPIDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		System.out.println("Main Starts");

		List list = new ArrayList();
		int size = list.size();
		System.out.println("Size: " + size);
		boolean isEmpty = list.isEmpty();
		System.out.println("isEmpty: " + isEmpty);
		list.add("Deepti");
		list.add(1);
		list.add("XYZ Street");
		list.add("NJ State");
		list.add(new Date());
		list.add(null);
		list.add(null);
		list.add(1, "Sagar");
		list.add("Last Value");
		size = list.size();
		System.out.println("Actual List: " + list.toString());
		System.out.println("Size:" + size);
		boolean containsFlag = list.contains("Deep");
		System.out.println("Contains Deepti: " + containsFlag);
		Object arraysObject[] = list.toArray();
		for (Object obj : arraysObject) {
			System.out.println(obj);
		}
		System.out.println("Main ENds");
	}

}
