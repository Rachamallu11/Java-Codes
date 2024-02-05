package package1;


class student{
	
	int rollno;
	String name;
	int marks;
	
}

public class Arrays {

	public static void main(String[] args) {
		
//		int num [ ] = new int[ 3 ];
//		
//		num[0] = 33;
//		num[1] = 31;
//		num[2] = 90;
//		
//		for(int i = 0 ; i<3; i++) {
//			System.out.println(num[i]);		}
		
		//-------------------Multi dimentional array-----------------------------
		
		
		
//          for(int i=0; i<3; i++) {            // for the outer box index value for '3' size. this for loop is used for itteration of array 
//			
//			for(int j = 0; j<4 ; j++) {      //for the inside the box represented the index value '4' size 
//				
//				System.out.print(num[i][j] + " ");
//				
//			}
//			
//			System.out.println();
//		}
		
		
		//----------------------Jagged Array------------------------------
		
		
//         int num [ ][ ] = new int [3 ][];  //here we don't know the index of the array size below we are mentioning 
//		
//		num[0] = new int[3];       //if we don't know the index of the array then we can write like this
//		num[1] = new int[4];      //this "new int[]" in this we have to give the size of the array 
//		num[2] = new int [5];
//		
//            for(int i=0; i<num.length; i++) {   //this "num.length" is used for jagged array and if we have different array length   
//			
//			for(int j = 0; j<num[i].length ; j++) {     
//				
//				num[i][j] = (int)(Math.random() * 100); //Math.random value will fetch the random value in the array it will not give the '0'
//				
//				System.out.println(num[i][j] + " ");
//				
//			}
//			
//			System.out.println();
//		}
//		
//            for(int i=0; i<num.length; i++) {            
//    			
//    			for(int j = 0; j<num[i].length ; j++) {  
//    				
//    				System.out.print(num[i][j] + " "); // this for loop is not using the math.random function so this output is different
//    				
//    			}
//    			
//    			System.out.println();
//    		}
//            
            
       //-------------------------------------------Creation of Student arrays----------------------------
		
		student s1 = new student();
		
		s1.marks = 45;
		s1.name = "Satya";
		s1.rollno = 1;
		
		student s2 = new student();
		
		s2.marks = 40;
		s2.name = "Rana";
		s2.rollno = 3;
		
		student s3 = new student(); 
		
		s3.marks = 0;
		s3.name = "Rohini";
		s3.rollno = 10;
		
		student student[] = new student[3]; //this an array here we are storing the three student objects and we are defining with the index 
		student[0] = s1;
		student[1] = s2;
		student[2] = s3;
		
//		for(int i = 0 ; i<student.length; i++) {   //this for loop is for the array repition 
//			
//			System.out.println(student[i].marks + " "+ student[i].name + " "+ student[i].rollno);
//		}
		//----------------or we can use Enhanced for loop ------------------------------------
		
		for(student stud : student) {   //the enhanced for loop is used without itteration and condition 
			
			System.out.println(stud.marks + " : " + stud.name + " : " + stud.rollno);
			
		}
		
		
		
		
	}

}
