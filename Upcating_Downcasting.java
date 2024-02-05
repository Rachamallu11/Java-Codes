package Package2;

class satya{
	
	public void show1() {
		System.out.println("in a Satya Show.....");
	}
}
class rana extends satya{
	
	public void show2() {//here we are doing the not the overriding because these are the two diff methods in satya and rana classes 
		
		System.out.println("in a rana show.....");
	}
}

public class Upcating_Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//here we are taking the rana is super class and satya is child class by this we are casting the super class into it.
		//and here we are doing the upcasting by taking the super class that is up class which is 
		// we cannot print the show2() method by this obj because we are not doing the override method. 
		// if when we use override then the another method is also printed 
		
		satya obj = (satya) new rana();   // upcasting.......
		obj.show1();
		
		// if we want to print the another method also that is show2() also then we can do the Downcasting 
		
		rana obj1 = (rana) obj;  // Downcating....  here we are comparing the rana child class to super class reference "obj" 
		obj1.show2();
		
	}

}
