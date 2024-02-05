package Package2;

class AAA{
	
	public AAA()   // this is  a default constructor 
	{
		super();
		System.out.println("in a class A");
		
	}
	
	public AAA(int n)   //this is a parameterised constructor
	{
		super();
		System.out.println("in a class A int param");
	}
    
}
class BB extends AAA{
	
	public BB()   //this is  a default constructor 
	{
		super();
		System.out.println("in a class B");
	}
	
	public BB(int n)  //this is a parameterised constructor
	{
		this();//if we want both default and parametised constructor values at o/p of the particular class then we use the "this" keyword 
		//super(n); // if we are passing this "n" as a parameter then we will get the only the parameterised output from both class A and B 
		System.out.println("in a class B int param");
	}
	
}
	
	
public class This_Super_Keywords {

	public static void main(String[] args) {
		
		BB obj = new BB(74);   //if we are passing the parameter then the parameter constructor will print. if not it will print default constructor
	}

}
