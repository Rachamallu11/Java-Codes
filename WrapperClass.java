package Package2;

public class WrapperClass {

	public static void main(String[] args) {
		
		int num = 3;   // "int" is a primitive data type 
		
		Integer  num1 = num;  //"Integer" is a class we are converting  // this is "autoboxing"  it is a conversion of primitive datatype to non-primitive datatype 
		
		System.out.println(num1);
		
		
//below this is "auto-unboxing" conversion of non primitive to primitive here "num1" is non primitive now we are conerting to primitive  
		int num2 = num1;   
		System.out.println(num2);
		
		String str = "12";  //here we are taking the integer as a string and we are converting string to integer by using below one 
		
		int num3 = Integer.parseInt(str);  //this is converting the string to integer function 
		
		System.out.println(num3);
		
		int num4 = 44;  // this is conversion of integer to string 
		
		String str1 = Integer.toString(num4);
		
		System.out.println(str1);
		

	}

}
