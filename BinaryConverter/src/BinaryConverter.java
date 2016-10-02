import java.util.Scanner;
import java.util.regex.Pattern;

public class BinaryConverter {
	
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		boolean isInputBinary = false;
		
		while (true)
		{
			System.out.print("Text or Binary? [T, B]: ");
			String inputFormatChoice = scanner.nextLine();
			
			if (inputFormatChoice.equalsIgnoreCase("T") || inputFormatChoice.equalsIgnoreCase("B"))
			{
				isInputBinary = inputFormatChoice.equalsIgnoreCase("B");
				break;
			}
		}
		
		System.out.println("The input is " + (isInputBinary ? "" : "not") + " binary");
		
		while (true)
		{
			System.out.print("Input: ");
			String input = scanner.nextLine();
			
			if (isInputBinary && Pattern.matches("[01]+", input))
			{
				System.out.println(convertBinaryToText(input));
				break;
			}
			
			if (!isInputBinary)
			{
				// TODO Implement text to binary support.
				break;
			}
		}
	}
	
	private static String convertBinaryToText(String binary)
	{
		String text = "";
		for (int count = 0; count < binary.length(); count += 8)
		{
			int binaryLetterStart = count * 8;
			int binaryLetterLength = Math.min(binary.length() - binaryLetterStart, 8);
			String binaryLetter = binary.substring(binaryLetterStart, binaryLetterStart + binaryLetterLength);
			text += new Character((char) Integer.parseInt(binaryLetter, 2)).toString();
		}
		
		return text;
	}

}
