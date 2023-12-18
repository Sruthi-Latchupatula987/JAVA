package CoreJava;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		System.out.println("Before Swapping of 2 numbers "+a+" ,"+b);
		//Logic1 third variable
		/*int t=a;
		a=b;
		b=t;*/
		//Logic2 use - & + without using third variable
			/*	a=a+b;
				b=a-b;
				a=a-b;*/
		//Logic3 use * and / without using third variable
		//here a&b values should not be zero
		
	/*	a=a*b;
		b=a/b;
		a=a/b; */
		//Logic4 bitwise XOR(^)
		/*a=a^b;  //10^20=30
		b=a^b;  //30^20=10
		a=a^b;  //30^10=20
				*/
		//Logic5 - single statement
		b=a+b-(a=b);  //execution from right to left
		System.out.println("After Swapping of 2 numbers "+a+" ,"+b);
		
		
		

	}

}
