//Checking the string by ignoring the cases
class Pg1{

	private static Integer check(String s1,String s2){
		Integer len1=s1.length();
		Integer len2=s2.length();
		Integer i=new Integer(0);
		if (len1>len2) return -1;
		if (len2>len1) return 1;
		while (i<len1){
			if ((s1.charAt(i)>='a' && s1.charAt(i)<='z') && (s2.charAt(i)>='A' && s2.charAt(i)<='Z')){
					if (s1.charAt(i)-32 > s2.charAt(i)) return -1;
					if (s1.charAt(i)-32 < s2.charAt(i)) return 1;
			}
			else if(((s1.charAt(i)>='A' && s1.charAt(i)<='Z') && (s2.charAt(i)>='z' && s2.charAt(i)<='z'))){ 
						if (s1.charAt(i) > s2.charAt(i)-32) return -1;
						if (s1.charAt(i) < s2.charAt(i)-32) return 1;
			}
			else {
					if (s1.charAt(i) > s2.charAt(i)) return -1;
					if (s1.charAt(i) < s2.charAt(i)) return 1;

			}
			i++;
		}
		return 0;

	}
	public static void main(String args[]){
				
		String s1="abd";
		String s2="ABE";
		Integer res=check(s1,s2);
		if (res==-1) System.out.println("String 1 is greater");
		else if (res==1)System.out.println("String 2 is greater");
		else System.out.println("Both the strings are equal");
	}
}

