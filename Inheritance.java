package package1;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VeryAdvcalc obj = new VeryAdvcalc();
		int r1 = obj.add(2,5);
		int r2 = obj.sub(7,9);
		int r3=obj.multi(3, 5);
		int r4 = obj.div(20, 5);
		double r5 = obj.power(5, 2);
		
		System.out.println(r1 + " "+ r2 + " "+ r3 + " "+ r4 + " " + r5);

	}

}
