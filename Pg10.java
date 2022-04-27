import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class DateTime{
	Integer H;
	Integer m;
	Integer s;
	Integer d;
	Integer M;
	Integer y;
}
class Pg10{

	private static void print(DateTime dt){
		System.out.println("Hour    :"+dt.H);
		System.out.println("Minute  :"+dt.m);
		System.out.println("Second  :"+dt.s);
		System.out.println("Day     :"+dt.d);
		System.out.println("Month   :"+dt.M);
		System.out.println("Year    :"+dt.y);
		System.out.println();
	}

	private static Integer check(DateTime d1,DateTime d2){
		if (d1.H > d2.H) return -1;
		if (d1.H<d2.H)   return 1;
		else{
			if (d1.m> d2.m) return -1;
			if(d1.m<d2.m)   return 1;
			else{
				if (d1.s> d2.s)return -1;
				if(d1.s<d2.s)  return 1;
				else{
					if(d1.d>d2.d) return -1;
					if(d1.d<d2.d) return 1;
					else{
						if(d1.M>d2.M) return -1;
						if(d1.M<d2.M) return 1;
						else{
							if(d1.y>d2.y) return -1;
							if(d1.y<d2.y) return 1;	
							else return 0;	
						}
					}
				}
			}
		}

	}

	private static DateTime spilt(String str){

		StringBuilder sb=new StringBuilder();
		Integer flag=new Integer(0);
		DateTime dt=new DateTime();

		for (Integer i=0;i<str.length();i++){
			if(str.charAt(i)=='-'|| str.charAt(i)=='_'){
				System.out.println(sb.toString());	
				if (flag==0){
					dt.H=Integer.valueOf(sb.toString());
					flag++;
					sb.setLength(0);
				}
				else if (flag==1){
					dt.m=Integer.valueOf(sb.toString());
					flag++;
					sb.setLength(0);
				}
				else if(flag==2){
					dt.s=Integer.valueOf(sb.toString());
					flag++;
					sb.setLength(0);	
				}
				else if(flag==3){
					dt.d=Integer.valueOf(sb.toString());
					flag++;
					sb.setLength(0);	
				}
				else{
					dt.M=Integer.valueOf(sb.toString());
					flag++;
					sb.setLength(0);	
				}
			}
			else{

				sb.append(str.charAt(i));
			}

		}
		dt.y=Integer.valueOf(sb.toString());
		return dt;
	}

	public static void main(String args[]){
			LocalDateTime dateobj=LocalDateTime.now();
			DateTimeFormatter obj=DateTimeFormatter.ofPattern("H-m-s_d-M-y");
			String input="10-34-60_27-4-2022";
			DateTime obj1=spilt(input);			
			DateTime obj2=spilt(obj.format(dateobj));

			print(obj1);
			print(obj2);
			Integer res=check(obj1,obj2);
			if (res==0) System.out.println("Both are same");
			else if(res==-1) System.out.println("Date1 is larger");
			else  System.out.println("Date2 is larger");


	}		
}