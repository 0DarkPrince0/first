package git;

public class Calculator {

	
	
	public int add(int number1, int number2) {
		return number1+number2;
	}
	
	public int sub( int number1, int number2) {
		return number1-number2;
	}
	public static void main(String[] args) {

		
		Calculator calculator=new Calculator();
		int number1=5;
		int number2=2;
		
		int add=calculator.add(number1, number2);
		System.out.println(add);
		
		int sub=calculator.sub(number1, number2);
		System.out.println(sub);
	}

}
