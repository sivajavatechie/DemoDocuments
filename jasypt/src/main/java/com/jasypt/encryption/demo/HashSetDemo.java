package com.jasypt.encryption.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(2);
		set.add(43);
		set.add(34);
		set.add(100);
		set.add(32);
		
		Collections.synchronizedCollection(set);
		
		System.out.println(set);

	}

}
