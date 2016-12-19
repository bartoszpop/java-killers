package com.gmail.at.bartoszpop.javakillers.inheritance;
public class SubclassConstructor {
    public class Base {
        public Base(int i) {
        }

        public Base(double i) {
        }
    }

    public class Child extends Base {
        public Child(int i) { // only single constructor required
            super(i);
        }
    }
}