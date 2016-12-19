package com.gmail.at.bartoszpop.javakillers.nullref;
public class NullInstanceOf {
    public static void main(String[] args) {
        if ( null instanceof String ) {
            System.out.println("String");
        } else if ( null instanceof Object ) {
            System.out.println("Object");
        } else {
            System.out.println("Null");
        }
    }
}