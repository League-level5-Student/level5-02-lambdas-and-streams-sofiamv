package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "horse");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((a)->{
			String h = "";
			char[] b = a.toCharArray();
			for(int i = b.length-1; i >=0; i--) {
				h = h+b[i];
			}
			System.out.println(h);
		}, "horse");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) ->{
		String r = "";
		String bean =s.toLowerCase();
		String omg = s.toUpperCase();
		for(int i = 0; i < bean.length(); i++) {
			if(i%2 == 0) {
			r = r +	bean.charAt(i);
			}else {
			r = r+omg.charAt(i);
			}
		}
		System.out.println(r);
		}, "horse");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((f)->{
		String b = "";
		for(int i = 0; i < f.length(); i++) {
			b = b+ f.charAt(i) + ".";
		}
		System.out.println(b);
		}, "horse");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((f) -> {
		String w = "";
		for(int i = 0; i < f.length(); i++) {
		if(f.charAt(i) != 'a' && f.charAt(i) != 'e' && f.charAt(i) != 'i' && f.charAt(i) != 'o' && f.charAt(i) != 'u') {
		w = w+f.charAt(i);
		}
		}
		System.out.println(w);
		}, "sequoia");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
