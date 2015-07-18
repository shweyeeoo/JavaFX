package calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		
		int i=c.add(10, 5);
		System.out.println(i);
		
		int j=c.subtract(10, 5);
		System.out.println(j);
		
		int k=c.multiply(10, 5);
		System.out.println(k);
		
		int l=c.divide(10, 5);
		System.out.println(l);
		

	
	}
}
