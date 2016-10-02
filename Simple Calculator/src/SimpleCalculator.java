import javax.swing.JFrame;
import java.util.*;
@SuppressWarnings("unused")
public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner NumInput1 = new Scanner(System.in);
		@SuppressWarnings({ "resource" })
		Scanner NumInput2 = new Scanner(System.in);
		@SuppressWarnings({ "resource" })
		Scanner OpInput = new Scanner(System.in);
		
		int num1;
		int num2;
		String op1;
		
		System.out.println("Simple Calculator Application v1.0 by Ben's Tech Garage");
		System.out.println("Put each number/operation on a seperate line by pressing enter.");
		System.out.println("Only one operation and 2 numbers per line allowed.");
		
		
		new CalculatorGUI();

	
		
	while (true) {	
		num1 = NumInput1.nextInt();
		NumInput1 = new Scanner(System.in);
		op1 = NumInput1.nextLine();
		num2 = NumInput1.nextInt();
		
		
		if(op1.equalsIgnoreCase("x")) {
			System.out.println(num1*num2);
		}
		if(op1.equalsIgnoreCase("+")){
			System.out.println(num1+num2);
		}
		if(op1.equalsIgnoreCase("-")) {
			System.out.println(num1-num2);
		}
		if(op1.equalsIgnoreCase("/")) {
			System.out.println(num1/num2);
		}
	}
	}
}
