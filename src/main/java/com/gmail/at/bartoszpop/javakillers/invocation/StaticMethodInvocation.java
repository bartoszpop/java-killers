package com.gmail.at.bartoszpop.javakillers.invocation;

public class StaticMethodInvocation {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        System.out.println(A.doSomething()); // A
        System.out.println(B.doSomething()); // B
        System.out.println(a1.doSomething());// A
        System.out.println(a2.doSomething());// A
    }
    
    private static class A {
        public static String doSomething() {
            return "A";
        }
    }

    private static class B extends A {
        public static String doSomething() {
            return "B";
        }
    }
}