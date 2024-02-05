package Package2;

enum status{   //enum is a class 
	
	Success,Failed,Pending,Compiling;  // these are objects 
	
}

public class enumaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		status s = status.Failed;
		status[] sr = status.values();  //this will print the all values we have to define with the array 
		
		for(status ss :sr) {
			System.out.println(ss);
		}
		
		System.out.println(s.ordinal());  //".ordinal()"  means it print the index 
		
		//if we want to print all values in the status 
		
		

	}

}
