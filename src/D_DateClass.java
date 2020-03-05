import java.text.SimpleDateFormat;
import java.util.Date;

public class D_DateClass {

	public static void main(String[] args) {
		
	Date d = new Date(); 
	SimpleDateFormat sdt = new SimpleDateFormat("M/d/yyyy");  //M should be Capital letter , small m refer to minus
	
	System.out.println(sdt.format(d));
	System.out.println(d.toString());
		
	
	}

}
