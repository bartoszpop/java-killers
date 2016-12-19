package com.gmail.at.bartoszpop.javakillers.exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ConcurrentModificationException {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("a");
		collection.add("b");

		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			// works because next iterator.hasNext() invocation returns false
			// (cursor = 1, size = 1)
			// if ( "a".equals(item) ) {

			/*
			 * @formatter:off
			 * Exception in thread "main" java.util.ConcurrentModificationException
			 * at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
			 * at java.util.ArrayList$Itr.next(ArrayList.java:851)
			 * @formatter:on
			 * because next iterator.hasNext() invocation returns true (cursor = 2, size = 1)
			 */
			//
			if ("b".equals(item)) {
				collection.remove(item);
			}
		}
	}
}