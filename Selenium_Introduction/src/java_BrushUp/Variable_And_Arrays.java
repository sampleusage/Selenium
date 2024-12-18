package java_BrushUp;

public class Variable_And_Arrays {
	public static void main(String[] args) {
		// Variables
		
		int num = 5;
		double d = 1290091;
		float f = 12.8971f;
		char ch = 'r';
		String string = "java";
		System.out.println(num);
		System.out.println(string);
		
		// Arrays
		
		int [] array = new int [5];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		System.out.println(array[0]);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		
		System.out.println();
		
		int [] array1 = {0,1,2,3,4,5};
		System.out.println(array1[2]);
		for(int i = 0; i<array1.length; i++) {
			System.out.print(array1[i]);
		}
		
		System.out.println();
		for(int i1:array1) {
			System.out.print(i1);
		}
		System.out.println();
		
		String [] s = {"Java", "with", "Selenium"};
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		
		System.out.println();
		
		for(String s1:s) {
			System.out.print(s1);
		}
	}
}
