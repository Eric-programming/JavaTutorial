package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsPractice {

	public static void main(String[] args) {

		// Integer List
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		// Double list
		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
		// Instance List
		List<GenericsHuman> list3 = Arrays.asList(new GenericsHuman("Eric"), new GenericsHuman("A"),
				new GenericsHuman("B"));
		printlist(list1);

		printlist(list2);

		printlist(list3);
		////////////////////////////////////////////////////////////////////

		ArrayList<GenericsJack> jack = new ArrayList<>();// Child Class of GenericsTom
		ArrayList<GenericsSam> sam = new ArrayList<>();// Parent Class of GenericsTom
		// UpperBound
		ArrayList<? extends GenericsTom> tomUpperBound = new ArrayList<>();
		tomUpperBound = jack;
		// LowerBound
		ArrayList<? super GenericsTom> tomLowerBound = new ArrayList<>();
		tomLowerBound = sam;
		tomLowerBound = new ArrayList<Object>();

	}

	private static void printlist(List<?> list) {
		System.out.println(list);
	}

}

class GenericsHuman {
	String name;

	public GenericsHuman(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "GenericsHuman [name=" + name + "]";
	}
}

class GenericsSam {

}

class GenericsTom extends GenericsSam {

}

class GenericsJack extends GenericsTom {

}