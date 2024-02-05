package Package2;

class Mobile{  
	int Price;           //instance variable 
	static String name;   //static variable
	String Brand;     //this one is instance variable
	
	public void show() {      //for printing the values we are writing the method 
		
		System.out.println(Brand + " : " + name + ":"+ Price);
	}
	
	public static void show1(Mobile obj) {    //using "static method"  and here we are passing parameters for the instance variables 
		
  //"name" is a static method remaining Brand and Price are the instance variables so we are passing parameters into to access them 
		
		System.out.println(obj.Brand + " : " + name + ":"+ obj.Price );  
	}
}

public class StaticVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile obj1 = new Mobile();
		obj1.Brand = "Apple";
		Mobile.name = "SmartPhone";
		obj1.Price = 57000;
		
		//here we are creating two objects because we are checking the static keyword 
		
		Mobile obj2 = new Mobile();
		obj2.Brand = "Samsung";
		obj2.Price = 72000;
		Mobile.name = "SmartPhone";  //here we can use with class name indication instead of obj2 we can use class name 
		
		
		
        // below if we can change the name the two objects names can also changed the "SmartPhone" is changed to "Phone" 
		//because we used the static variable in name. static is a independent to its object 
		
		Mobile.name = "phone"; 
		
		
		obj1.show();
		obj2.show();
		
		

	}

}
