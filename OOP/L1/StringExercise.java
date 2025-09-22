import java.lang.String;

public class StringExercise{
	public static void main(String[] args)
	{
		String s = "Play with Java";
		int l = s.length();
		String uc = s.toUpperCase();
		String lc = s.toLowerCase();
		String c= s.concat(":-)");
		String r = s.replace("ava", "AVA");
		String s2= "Play with C++";
		
		System.out.println(s);
		System.out.println(l);
		System.out.println(c);
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(r);
		System.out.println(s2);
		System.out.println(s.compareTo(s2));

	}
}