package Package2;



public class Exceptions_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =20;  //suppose if we have the 0 in 'i' then in this case we have to use the try and catch 
		// we have to create the exceptions 
		//int i =0;
		int j = 0;
		//if i = 0 then it will return the try block o/p otherwise it will goes to catch block
		// if i = 0 then o/p of the j will not get and if i = some value then we will get the j value 
		
		int num[ ] = new int[6];  // this is another exception 
		
		
		try {
		     j =18/i;
		     if(j==0)
		    	 throw new ArithmeticException();    //throw keyword will throw to catch block when given the condition  
		    System.out.println("getting the o/p");
		    System.out.println(num[1]);
		    System.out.println(num[6]); 
		    // here we are giving the index as 6 value but in the array we have 0 to 5 so this is an exception what will print at the index 0 this is out of bound length 
		    
		}
		catch(ArithmeticException e) {
			
			System.out.println("if not it will come to catch block" + e);   // when we print the e then we will get the what the exception is.. 
		}
		
		// we need to print the out of bound length also then we have to create another catch 
		
		catch(ArrayIndexOutOfBoundsException e) {  //this is for array out bound 
			
			System.out.println( "length limit is large..");
		}
		catch (Exception e) {   //exception is parent of ArrayIndexOutOfBoundException, ArthemeticException parent class will be at end if we keep it as top it will shows the error 
			
			System.out.println("Something went wrong....");
		}
		System.out.println(j);
	}

}
