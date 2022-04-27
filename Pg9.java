import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
class Pg9{
	public static void main(String args[]){
			LocalDateTime dateobj=LocalDateTime.now();
			DateTimeFormatter obj=DateTimeFormatter.ofPattern("d-MMM-y");
			System.out.println(obj.format(dateobj));
			obj=DateTimeFormatter.ofPattern("H...m...s");
			System.out.println(obj.format(dateobj));
	}
}