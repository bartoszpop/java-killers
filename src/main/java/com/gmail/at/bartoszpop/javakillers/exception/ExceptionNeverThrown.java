package com.gmail.at.bartoszpop.javakillers.exception;

public class ExceptionNeverThrown {
	public static void main(String[] args) {
		try {
		// no warning because Exception is a super type of RuntimeException
		} catch (Exception e) { 
		// "exception is never thrown" warning
		// } catch (IOException e) {
			System.out.println("Caught: " + e);
		}
	}
}