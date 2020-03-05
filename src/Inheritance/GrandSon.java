package Inheritance;

public class GrandSon extends Son{

	public static void main(String[] args) {
		
		int GrandSon_Assets=200000;
		GrandSon gs = new GrandSon();
		System.out.println("Grandson property is: " +GrandSon_Assets);
		gs.son_Will();
		gs.GF_Will();
		

	}

} 
