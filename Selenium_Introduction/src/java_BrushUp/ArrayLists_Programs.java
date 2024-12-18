package java_BrushUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists_Programs {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Selenium");
		a.add("With");
		a.add("Java");
		System.out.println(a.get(2));
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		for(String string:a) {
			System.out.println(string);
		}
		// Item is present in ArrayList
		System.out.println(a.contains("Java"));
		
		// Converting normal Array to List
		String[] name = {"Selenium", "With", "Java"};
		List<String> convertedList = Arrays.asList(name);
		convertedList.contains("Java");
	}
}
