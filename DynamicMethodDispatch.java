package Package2;


class Aclass{
	
	public void show() {
		System.out.println("in A show");
	}
}

class Bclass extends Aclass{
	
	public void show() {
		
		System.out.println("in B show");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		
		//here we are creating the object of super class with the child class -->  //Aclass obj = new Bclass()
		Aclass obj = new Aclass();  
		obj.show();
		
		obj = new Bclass();   //if we declare this Bclass of new object then it will print of Bclass because it is a extends of Bclass
		obj.show();
		
		//if we create the another class which is not extends the Aclass i.e, super class then this method will nt work this is calle Dynamic Dispatch method 
		
	}

}
