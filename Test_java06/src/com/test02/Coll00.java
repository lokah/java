package com.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable<Object> {

	int serial;
	String owner;

	Computer(int serial, String owner) {

		this.serial = serial;
		this.owner = owner;
	}

	public int compareTo(Object o) {

		return this.serial - ((Computer) o).serial;
	}

	public String toString() {

		return serial + " " + owner;
	}
}

public class Coll00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Computer> computers = new ArrayList<Computer>();
		Computer com = new Computer(500, "pink");
		Computer com1 = new Computer(300, "blue");
		computers.add(com);
		computers.add(com1);
		computers.add(new Computer(700, "black"));
		Iterator<Computer> i = computers.iterator();
		System.out.println("before");
		System.out.println(computers);

		while (i.hasNext()) {

			System.out.println(i.next());
		}

		Collections.sort(computers);
		System.out.println("\nafter");
		i = computers.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

	}

}
