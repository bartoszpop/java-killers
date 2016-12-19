package com.gmail.at.bartoszpop.javakillers.instantiation;

@SuppressWarnings("unused")
public class Singleton {
	private static final Singleton instance1 = createInstance(); // "field"

	private static Singleton createInstance() {
		return new Singleton();
	}

	private static final Singleton instance2 = new Singleton(); // "field"

	private static final Singleton instance3;

	static {
		instance3 = new Singleton(); // "field"
	}

	private static final String field = "field";

	private Singleton() {
		System.out.println(field);
	}
	
	public static void main(String[] args) {
	}
}