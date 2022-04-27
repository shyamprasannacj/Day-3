//Checking the no of occurrence of a substring in a given string
class Pg2{
	private static Integer check(String s1,String s2){
		Integer len1=s1.length();
		Integer len2=s2.length();
		Integer count=new Integer(0);
		Integer i=new Integer(0);
		while (i<len1-len2+1){
			if (s1.substring(i,i+len2).compareTo(s2)==0){
				count++;
				i+=len2;
			}
			else i++;
		}
		return count;

	}
	public static void main(String args[]){
		String str="abcdefgabcabc";
		String substr="abc";
		Integer res=check(str,substr);
		System.out.println("The no of occurrence of substring"+substr+" is :"+res);
	}
}

