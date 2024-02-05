package package1;

abstract class aeroplane{
	public abstract void fly();
	
	public abstract void moving();
}

abstract class Airindia extends aeroplane{
	
	@Override
	public void fly() {
		System.out.println("flying..");
		// TODO Auto-generated method stub
		
	}
	
	
}

class updatedAirindia extends Airindia{  ///this is concrete class 

	@Override
	public void moving() {
		System.out.println("moving..");
		// TODO Auto-generated method stub
		
	}
	
}


public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airindia obj = new updatedAirindia();   // we have create the object for the concrete class not abstrct class
		obj.fly();
		obj.moving();
	}

}
