package Programs;

public class StringMethods {

	public static void main(String[] args) {
		//length()
		String x="today is great day to learn somting new";
		System.out.println(x.length());
		//LowerCase()
		String s="with hard work and effort you can achieve anything";
		System.out.println(s.toUpperCase());
		//UpperCase()
		String d="PUSH YOURSELF BECAUSE NO ONE ELSE IS GOING TO DO IT FOR YOU";
		System.out.println(d.toLowerCase());
		//Concat()
		String c="PUSH YOURSELF ";
		System.out.println(c.concat("BECAUSE NO ONE ELSE IS GOING TO DO IT FOR YOU"));
		//substring(beg)
		String r="today is your opportunity";
		System.out.println(r.substring(10));
		//substring(end)
		String p="today is your opportunity";
		System.out.println(p.substring(6,12));
		//charAt()
		String str="achieve";
		char ch=str.charAt(2);
		System.out.println(ch);
		//Compare to()
		String str1="today is great day to learn somting new";
		String str2="with hard work and effort you can achieve anything";
		System.out.println(str1.compareTo(str2));
		//replace()
	     String m="with hard work and effort you can achieve anything";
	     System.out.println(m.replace('h', 'R'));
		

	}

}
