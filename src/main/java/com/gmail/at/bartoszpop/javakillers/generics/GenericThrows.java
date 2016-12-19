package com.gmail.at.bartoszpop.javakillers.generics;

public class GenericThrows {
	public static void main(String[] args) {
		// Exception is checked, but no Throws declaration
		sneakyRethrow(new Exception("foo"));
	}

	public static void sneakyRethrow(Throwable t) {
		GenericThrows.<Error>parameterizedThrow(t);
		// GenericThrows.<RuntimeException>parameterizedThrow(t);
	}

	// @SuppressWarnings("unchecked")
	private static <T extends Throwable> void parameterizedThrow(Throwable t) throws T {
		throw (T) t;
	}
}