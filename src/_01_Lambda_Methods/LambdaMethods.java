package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		//printCustomMessage((s)->{
			//for(int i = 0; i < 10; i++) {
				//System.out.println(s);
			//}
		//}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		String ss;
		printCustomMessage((a) ->{
			String h = "";
			char[] b=a.toCharArray();
			for(int i = b.length; i < 0; i--) {
			h = h+b[i];	
			System.out.println(a);
			}
			a = h;
			System.out.println(a);
		}, "horse");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) ->{
		char[]b =s.toCharArray();
		
		}, "horse");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
