package Inheritance;

public class Son extends GrandFatherClass{

	public static void main(String[] args) {
		
		//we need to acquire the properties/ rights of grandfather Class which is done by using the keyword "extends" 
		
		Son s = new Son();
		s.GF_Will();
		s.son_Will();
		
		
		
	}
public void son_Will()
{
int Son_Asset = 200000000;
int Son_property = 500000;
int Son_cash = 200000;
int Son_PropertySum= (Son_Asset+Son_property+Son_cash);

		
System.out.println("Son property is: " + Son_PropertySum);
	
	}
}

