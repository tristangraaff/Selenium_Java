package java_introduction;

public class JavaStrings {

	public static void main(String[] args) {
		//wil point to the same object
		String s = "Tristan Graaff Academy";
		String s1 = "Tristan Graaff";
		
		//two objects will be created
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String[] splittedString = s.split("Graaff");
		for (int i = 0; i < splittedString.length; i++) {
			System.out.println(splittedString[i].trim());
		}
		
		for (int i = s.length() - 1; i > -1; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
