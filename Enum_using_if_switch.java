package Package2;

enum position{
	Right,Left,Circlur,Rightangle;
}
public class Enum_using_if_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//............................enum using "if" condition.....................
		
//		position p = position.Right;
//		
//		if(p == position.Right)
//			System.out.println("it is good");
//		else if(p == position.Circlur)
//		    System.out.println("it is circular");
//		
//		else if(p ==position.Left)
//			System.out.println("it is a left pos");
//		
//		else
//			System.out.println("All good");
		
		
		//.......................using switch statement.........................
		
		
		position p = position.Rightangle;
		
		switch(p) {
		
		case Right:
			System.out.println("all fine");
			break;
			
		case Left:
			System.out.println("it is ahow");
			break;
			
		case Circlur:
			System.out.println("clear");
			break;
			
		default:
			
			System.out.println("Everything clear");
		}
		
		
		
		
		
		
		   

	}

}
