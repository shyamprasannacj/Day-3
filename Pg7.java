//Tokenize delimiter---> -,@
class Pg7{	

	private static void spilt(String str){
		StringBuilder sb=new StringBuilder();

		for (Integer i=0;i<str.length();i++){
			if (str.charAt(i)=='-' || str.charAt(i)=='@'){
				if (sb.length()!=0) System.out.println(sb.toString());
				sb.setLength(0);
			}
			else{
				sb.append(str.charAt(i));
			}
		}
		if (sb.length()!=0){
			System.out.println(sb.toString());
		}
	}

	public static void main(String args[]){
		String str="-shyam-prasanna-cj@zoho";
		spilt(str);
	}

}
