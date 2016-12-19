package com.gmail.at.bartoszpop.javakillers.invocation;
@SuppressWarnings("unused")
public class Varargs {
    public static void main(String[] args) {
        /* prints
         * [Ljava.lang.Object;@3fdb8a73
         * 0
         */
        varargs();

        /* prints
         * [Ljava.lang.Object;@1a06f956
         * 1
         * [I@3fdb8a73
         */
        varargs(new int[] { 1, 2, 3 });

        /* prints
         * [Ljava.lang.Integer;@6a92e96c
         * 3
         * 1 2 3
         */
        varargs(new Integer[] { 1, 2, 3 }); // prints 1 2 3
    }

    private static void varargs(Object... args) {
        System.out.println(args);
        System.out.println(args.length);
        for (Object arg : args) {
            System.out.print(arg);
            System.out.print(" ");
        }
        System.out.print("\n");
    }

    private static void stringVarargs(String... strings) {
        Object[] objects = strings;
    }

    private static void intVarargs(int... ints) {
    	// Object[] objects = ints; // "cannot convert" compilation error
    }
}