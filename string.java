package polymophism;

public class string {



	public static void main(String[] args) {
		String s="java,web,sql,spring";
		String s1="java,web,sql,spring";


		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("java"));
		System.out.println(s.endsWith("spring"));
		System.out.println(s.startsWith("Java"));//case sensitive
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("s"));
		System.out.println(s.lastIndexOf("s"));
		System.out.println(s.contains("java"));
		System.out.println(s==s1 );
		System.out.println(s.equals(s1)+"  equals");
		
	}
}
