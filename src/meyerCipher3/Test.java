package meyerCipher3;

public class Test {
	public static void main(String[]args) {
		 /*try {
			SubstitutionCipher s1 = new SubstitutionCipher("qwertzuiop�yxcvbnmasdfghjkl���");
			
			System.out.print("encrypt:\t");
				String text = s1.encrypt("Hello World! 123");
				System.out.println(text);
			System.out.print("decrypt:\t");
				System.out.println(s1.decrypt(text));
			System.out.println("--------------------");
			
		}catch(ExceptionsMeyer e) {
			System.out.println(e.toString());
		}
		
		try {
			ShiftCipher s1 = new ShiftCipher(3);
			
			System.out.print("encrypt:\t");
				String text = s1.encrypt("Hello World! 123");
				System.out.println(text);
			System.out.print("decrypt:\t");
				System.out.println(s1.decrypt(text));
				System.out.println("--------------------");
			
		}catch(ExceptionsMeyer y) {
			System.out.println(y.toString());
		}
		**/
		CipherController c = new CipherController();
	}
}
