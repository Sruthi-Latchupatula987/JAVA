package CoreJava;

public class Palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1678,rev=0,rem,i;
		i=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==i) {
				System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("the given number is not palindrome");
		}

	}

}
