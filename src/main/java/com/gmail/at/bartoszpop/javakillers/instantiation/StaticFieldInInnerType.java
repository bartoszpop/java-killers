package com.gmail.at.bartoszpop.javakillers.instantiation;

@SuppressWarnings("unused")
public class StaticFieldInInnerType {
	private Object anonymous = new Object() {
		private static final String CONSTANT_EXPRESSION = "abc";
		/*
		 * XXX compilation error
		 * "The field NON_CONSTANT_EXPRESSION cannot be declared static in a non-static inner type, unless initialized with a constant expression"
		 */
		// private static final Object NON_CONSTANT_EXPRESSION = new Object();
	};

	private class Inner {
		private static final String CONSTANT_EXPRESSION = "def";
		/*
		 * XXX compilation error
		 * "The field NON_CONSTANT_EXPRESSION cannot be declared static in a non-static inner type, unless initialized with a constant expression"
		 */
		// private static final Object NON_CONSTANT_EXPRESSION = new Object();
	}
}