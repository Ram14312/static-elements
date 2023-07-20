package org.studySpring;

import org.studySpring.test.TestStatic;

public class App {

	public static void main(String[] args) {
		System.out.println("current value is" + TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(24);
		System.out.println(" current value is" + TestStatic.getStaticVariable());
		System.out.println(" current value is" + TestStatic.getStaticVariable());
		

	}

}
