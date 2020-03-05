import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D_CalendarClass {

	public static void main(String[] args) {
	
		Calendar cal=Calendar.getInstance();
		Date d = new Date();
		
		SimpleDateFormat s=new SimpleDateFormat("M/d/yyyy");

	System.out.println(cal.DAY_OF_MONTH);
	System.out.println(s.format(d));
	

	}

}
