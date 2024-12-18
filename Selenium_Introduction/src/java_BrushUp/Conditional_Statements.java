package java_BrushUp;

public class Conditional_Statements {
	public static void main(String[] args) {
		
	int [] num = {1,2,3,4,5,6,7,8,9,10};
	for(int i=0;i<num.length;i++) {
		if(num[i]%2==0) {
			System.out.println(num[i]+"is multiple of 2");
		}
		else
			System.out.println(num[i]+"is not multiple of two");
	}
	}
}