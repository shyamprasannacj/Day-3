// Split the string into two/more with a delimiter

class Pg8{	

	private static String split(String str,Integer len){

		StringBuilder sb=new StringBuilder();

		for (Integer i=0;i<str.length();i++){
		
			if (i!=0 && i%len==0){
				sb.append("---");
			}
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String args[]){	
		String str="abcdefghijkl";
		System.out.println(split(str,3));
	}

}
