package com.gmail.at.bartoszpop.javakillers.visibility;

import com.gmail.at.bartoszpop.javakillers.visibility.subpackage.Base;

@SuppressWarnings("unused")
class ProtectedMethodVisibility{
	private Base baseInstance;
 
	private Child childInstance;

	public void invokingMethod() {
		//baseInstance.protectedMethod(); // compilation error "method ... is not visible"
		//childInstance.protectedMethod(); // compilation error "method ... is not visible"
	}
	
	private class Child extends Base {
		public void invokingMethod() {
			//baseInstance.protectedMethod(); // compilation error "method ... is not visible"
			super.protectedMethod();
			childInstance.protectedMethod();

			//baseInstance.packageMethod(); // compilation error "method ... is not visible"
			//super.packageMethod(); // compilation error "method ... is not visible"
			//childInstance.packageMethod(); // compilation error "method ... is not visible"
		}
	}
}