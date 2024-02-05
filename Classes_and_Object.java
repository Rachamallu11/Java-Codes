package package1;

class Calculator{
	
	int num1;
	int num2;   //have to declare the variables between the calss and Method 
	int result;
	public void perform() {
		result = num1+num2;
		
	}
}
public class Classes_and_Object {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator(); //calc is a reference table
		calc.num1 = 3;
		calc.num2 = 5;
		calc.perform();   //it will call the method
		System.out.println(calc.result);
		// TODO Auto-generated method stub

	}

}

