package Inheritance;

public class GrandFatherClass {

	public static void main(String[] args) {
		
	GrandFatherClass gf = new GrandFatherClass();
	gf.GF_Will();
		
		

	}
public void GF_Will()
{
	int GF_Asset = 100000000;
	int GF_property = 500000;
	int GF_cash = 100000;
	int GF_PropertySum= (GF_Asset+GF_property+GF_cash);
				
	System.out.println("GrandFather property is: " + GF_PropertySum);
}
}
