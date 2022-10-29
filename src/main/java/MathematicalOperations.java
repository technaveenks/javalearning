import com.learning.automation.javalearning.neeraja.IArthimeticOperator;

public class MathematicalOperations implements IArthimeticOperator {
	
	

	public static void main(String[] args) {
		MathematicalOperations mathematicaloperations=new MathematicalOperations();
		mathematicaloperations.addition(20, 10);
		mathematicaloperations.subtraction(20, 10);
		mathematicaloperations.multiplication(20, 10);
		mathematicaloperations.division(20, 10);
		mathematicaloperations.modulo(20, 10);

	}

	@Override
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}

	@Override
	public void subtraction(int a, int b) {
		int c = a-b;
		System.out.println(c);
		
	}

	@Override
	public void multiplication(int a, int b) {
		int c = a*b;
		System.out.println(c);
		
	}

	@Override
	public void division(int a, int b) {
		int c = a/b;
		System.out.println(c);
		
	}

	@Override
	public void modulo(int a, int b) {
		int c = a%b;
		System.out.println(c);
	}
	


}
