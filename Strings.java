package Package2;

public class Strings {

	public static void main(String[] args) {
		
		//we can give like String name; or here we are creating like an object 
		
		//String is not a Primitive datatype it is actually a class we can see also it is a class
		
		//String is starting with capital "S" comparing other datatypes all are starting with small letter like " int , float...."
		
		String name = new String("satya");    
		
		name = name + " mounika";     
		
		System.out.println(name);     
		System.out.println(name.charAt(8));
		System.out.println(name.concat(" Rachamallu"));
		
		String s1 = "Rana";   //it will check the heap memory that is String constant pool there we are comparing the string is it true or false 
		String s2 = "Rana";
		System.out.println(s1==s2);
		
		//String Buffer is a Mutable we can change 
		
		StringBuffer sb = new StringBuffer("Rana");
		
		System.out.println(sb.append(" Dheer"));
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.insert(4, " satya"));
		System.out.println(sb.deleteCharAt(5));
		
		
		

	}

}
