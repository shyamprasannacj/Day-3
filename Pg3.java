//To eliminate numeric values in a given string
class Pg3{
	private static String check(String str){
		StringBuilder sb=new StringBuilder();

		for (Integer i=0;i<str.length();i++){
			 if (!(str.charAt(i)>='0' && str.charAt(i)<='9')) sb.append(str.charAt(i)); 
		}

		return sb.toString();
	}
	public static void main(String args[]){
		String str="ab9193c31ab222c13";
		System.out.println("The new String is "+check(str));
	}
}

