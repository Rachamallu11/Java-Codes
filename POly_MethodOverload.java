package package1;

class Calculate{
	
	public int sum(int x, int y, int z) {
		
		return x+y+z;	
		
	}
	public double sum(int x, double y) {
		return x+y;
	}
	public int sum(int x, int y) {
		return x+y;
	}
}

public class POly_MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal = new Calculate();
		int r1 = cal.sum(2, 3);
		System.out.println(r1);

	}

}
