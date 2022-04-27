//To replace a substring with another in a string **(using Rabin Karp Algorithm)**
import java.lang.Math;
class Pg6{
	private static String check(String str,String substr,String rpl){
		Integer len1=str.length();
		Integer len2=substr.length();
		Double strhashv=new Double(0);
		Double substrhashv=new Double(0);
		Integer flag=new Integer(0);
		Integer ind = new Integer(0);
		
		StringBuilder sb=new StringBuilder();

		for (Integer i=0;i<len2;i++){
			strhashv=strhashv*10+str.charAt(i);
			substrhashv=substrhashv*10+substr.charAt(i);
		}
	
		for (ind=0;ind<len1;ind++){
		
			if (Double.compare(strhashv,substrhashv)==0){
				sb.append(rpl);
				flag=len2-1;
			}
			else{
					if (flag==0)	sb.append(str.charAt(ind));
					else flag--;
			}
			if (ind+len2>=len1) break;

			strhashv=(strhashv-(str.charAt(ind)*Math.pow(10,len2-1)))*10+(str.charAt(ind+len2));   
		}

		ind++;
		while(ind<len1){
			sb.append(str.charAt(ind));
			ind++;
		}
		return sb.toString();	

	}
	public static void main(String args[]){
		String str="abxyzcaxyzbcxyzabcxyzab";
		String substr="xyz";
		String rpl="123";
		System.out.println("The new String is "+check(str,substr,rpl));
	}
}

