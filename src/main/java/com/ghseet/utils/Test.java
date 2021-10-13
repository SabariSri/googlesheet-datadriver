package com.ghseet.utils;

import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(test());

		String s1 = "Buggy Bread";
		String s2 = "Buggy Bread";
		if (s1 == s2)
			System.out.println("equal 1");

		String n1 = new String("Buggy Bread");
		String n2 = new String("Buggy Bread");
		if (n1 == n2)
			System.out.println("equal 2");
	}
	
	private static int test() {
		int i = 0;
		try {
		i++;
		throw new NullPointerException();
		} catch (NullPointerException ex) {
		return i++;
		} finally {
		return ++i;
		}
		}

}
