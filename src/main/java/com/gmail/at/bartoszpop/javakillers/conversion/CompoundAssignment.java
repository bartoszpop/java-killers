package com.gmail.at.bartoszpop.javakillers.conversion;

public class CompoundAssignment {
	public static void main(String[] args) {
		long l = 1;
		int i = 2;
		/*
		 * @formatter:off
		 * i = (int)((long)i + l); this is what happens in case of += , don't need (long) casting since upper casting is done implicitly
		 * @see http://stackoverflow.com/questions/8710619/javas-compound-assignment-operators
		 * @formatter:on
		 */
		i += l;
		// i = i + l; // cannot convert from long to int
		i = (int) (i + l);
	}
}