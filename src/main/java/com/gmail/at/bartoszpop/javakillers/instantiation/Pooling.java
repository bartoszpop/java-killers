package com.gmail.at.bartoszpop.javakillers.instantiation;

public class Pooling {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(4096) == Integer.valueOf(4096));
        Integer i1 = 4096;
        Integer i2 = 4096;
        System.out.println(i1 == i2);

        System.out.println(Integer.valueOf(121) == Integer.valueOf(121));
        Integer i3 = 121;
        Integer i4 = 121;
        System.out.println(i3 == i4);
    }
}
