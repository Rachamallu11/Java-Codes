package Package2;

enum Laptop{
	
	Ram(6),Memory(64),colour,Size(32);   // if we didn't mention the prrice for the particular one then we need one constructor for that 
	
	
	private int Price;
	
    private Laptop() {   // this is default constrctor for the not mentioned one 
		
		Price = 500;
	}
	

	//here these are objects so we are defining the how much it is after defining the values we are getting the errors then we have to solve
	
	//by solving the errors we  have to create the constructor into it
	
	
	private Laptop(int price) {
		
		this.Price = price;
		
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	
}
public class enum_using_constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		Laptop lap = Laptop.colour;
//		System.out.println(lap  + " : "+ lap.getPrice());
		
		
		//for getting the all values we need to write a loop for it
		
		for(Laptop lap : Laptop.values()) {
			
			System.out.println(lap  + " : "+ lap.getPrice());
		}
	}

}
