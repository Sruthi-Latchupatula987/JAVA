package Java;

public class RevNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=876,rev=0,rem;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}
