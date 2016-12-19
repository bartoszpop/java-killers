package com.gmail.at.bartoszpop.javakillers.optimization;
public final class EmptyBlockOptimization {
    public static void main(String[] args) {
		if ((Boolean) null) { // if a block is empty JIT compiler probably optimizes it away and no NPE is thrown
		}
		System.out.println("No exception has been thrown.");
    }
}