//To eliminate a substring in a given string
class Pg4{
	private static String check(String str,String substr){
		StringBuilder sb=new StringBuilder();
		Integer len1=str.length();
		Integer len2=substr.length();
		Integer i=new Integer(0);
		while(i<=len1){
			if (i+len2>len1){
					sb.append(str.substring(i,len1));
					break;
			}
			if (str.substring(i,i+len2).compareTo(substr)!=0){
					sb.append(str.charAt(i));
					i++;
			}
			else {
					i+=len2;	
			}	
		}
		return sb.toString();
	}
	public static void main(String args[]){
		String str="abcxyzabxyzcabxyzc";
		String substr="xyz";
		System.out.println("The new String is "+check(str,substr));
	}
}

