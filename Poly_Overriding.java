package package1;

class MOM{
	
	public int child(int c1, int c2) {
		
		return c1+c2;
	}
	
}
class Dad extends MOM{
	
	public int child(int c1, int c2) {
		return c1+c2+4;
	}
}


public class Poly_Overriding {

	public static void main(String[] args) {
		
		MOM dad = new Dad();
		int r1 = dad.child(2,3);
		System.out.println(r1);
		// TODO Auto-generated method stub

	}

}
