//To replace a character with a given character
class Pg5{
	private static String check(String str,Character chr,Character rpl){
		StringBuilder sb=new StringBuilder();
		for (Integer i=0;i<str.length();i++){
			if(str.charAt(i)==rpl) sb.append(chr);
			else sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String args[]){
		String str="abcabcabc";
		Character chr='x';
		Character rpl='a';
		System.out.println("The new String is "+check(str,chr,rpl));
	}
}

