package PracticePrograms;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAddig {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add(100);
		l.add("abc");
		l.add('D');
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		l.set(2, "xyz");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains('D'));
		System.out.println(l.contains(null));
		System.out.println(l.contains("xyz"));
		System.out.println(l.get(1));
		System.out.println(l.get(4));
		l.remove(3);
		System.out.println(l);
		System.out.println(l.size());
	}

}
