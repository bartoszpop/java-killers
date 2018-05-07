package com.gmail.at.bartoszpop.javakillers.access;

/**
 * JLS 17.5.2. Reading final Fields During Construction
 * A read of a final field of an object within the thread that constructs that object is ordered with respect to the initialization of that field within the constructor by the usual happens-before rules. If the read occurs after the field is set in the constructor, it sees the value the final field is assigned, otherwise it sees the default value.
 */
public class FinalFieldAccess {
    private final String finalField;

    public FinalFieldAccess() {
        //System.out.println(finalField); // "Variable 'finalField' might not have been initialized" compilation error
        System.out.println((false ? null : this).finalField); // no compilation error
        finalField = "someString";
    }
}
