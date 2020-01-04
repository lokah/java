package com.test03;

import javax.sound.midi.MidiDevice.Info;

class Employ {
	
	public int rank;
	Employ(int rank) {
		
		this.rank = rank;
	}
}

class Person<T, S> {
	
	public T info;
	public S id;
	
	Person(T info, S id) {
		
		this.info = info;
		this.id = id;
		
		
	}
	
}



public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Employ em = new Employ(1);
	Integer i = new Integer(10);
	 Person<Employ, Integer> p1 = new Person<Employ, Integer>(em, i);
	 
	 System.out.println(p1.id.intValue());
		
	}

}
