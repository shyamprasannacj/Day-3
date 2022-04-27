//Checking the string by not ignoring the cases
class Pg1_2{
	private static Integer check(String s1,String s2){
		Integer len1=s1.length();
		Integer len2=s2.length();
		Integer i=new Integer(0);
		if (len1>len2) return -1;
		if (len2>len1) return 1;
		while (i<len1){
					if (s1.charAt(i) > s2.charAt(i)) return -1;
					if (s1.charAt(i) < s2.charAt(i)) return 1;
					i++;
		}
		return 0;
	}
	public static void main(String args[]){
				
		String s1="abde";
		String s2="abdE";
		Integer res=check(s1,s2);
		if (res==-1) System.out.println("String 1 is greater");
		else if (res==1)System.out.println("String 2 is greater");
		else System.out.println("Both the strings are equal");
	}
}

