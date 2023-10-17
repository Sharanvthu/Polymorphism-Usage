class recur
{
	String name;
	
	
	 public recur(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " name=" + this.name + "";
	}

	public static void main(String[] args) {
		/*String s1=new String("iam");
		System.out.println(s1);
		s1=s1.concat(" java");
		System.out.println(s1);
		StringBuffer s11=new StringBuffer("iam");
		System.out.println(s11);

		s11.append(" java");
		System.out.println(s11);
		String s="java";
		System.out.println(s);
		s="pyton";
		System.out.println(s);*/
		/*String s=new String("java");
		String s1=new String("iam devep");
		System.out.println(s+" "+s1);*/
		 recur r=new recur("sharan");
		 recur r1=new recur("manthu");
		 recur[] s={r,r1};
		 for(int i=0;i<s.length;i++)
		 {
			 System.out.print(s[i]);
		 }
	}
}