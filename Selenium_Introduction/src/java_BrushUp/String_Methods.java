package java_BrushUp;

public class String_Methods {
	public static void main(String[] args) {
		String s1 = "Selenium with Java";
		String s2 = "Selenium with Java";
		String s3 = "Hello Java";
		
		String s4 = new String("Selenium with Java");
		String s5 = new String ("Selenium with Java");
		
		String[] spiltString = s1.split("with");
		System.out.println(spiltString[0]);
		System.out.println(spiltString[1]);
		System.out.println(spiltString[1].trim());
		
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
	}
}