package com.gmail.at.bartoszpop.javakillers.nullref;

public class NullArgumentForOverloadedMethod {
	public static void main(String[] args) {
		A a = new A();
		/* 
		 * Compilation error "The method doSomething(Object) is ambiguous for the type MethodOverloadingForNull.A"
		 * Java will always try to use the most specific applicable version of a method that's available
		 * (@see http://stackoverflow.com/questions/5229809/method-overloading-for-null-argument)
		 * If only doSomething(Object object) and doSomething(String string) will be present, the latter will be choosen
		 */
		//a.doSomething(null);
		
		String string = null;
		a.doSomething(string); // doSomething(String)
	}

	private static class A {
		public void doSomething(Object object) {
			System.out.println("Object");
		}

		public void doSomething(String string) {
			System.out.println("String");
		}

		public void doSomething(Number string) {
			System.out.println("String");
		}
	}
}