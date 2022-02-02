package java_introduction;

public class JavaMethods {

	public static void main(String[] args) {
		JavaMethods methods = new JavaMethods();
		String name = methods.getData();
		System.out.println(name);
		
		JavaMethods2 demo2 = new JavaMethods2();
		String name2 = demo2.getData();
		System.out.println(name2);
		
		String name3 = getMoreData();
		System.out.println(name3);
	}
	
	public String getData() {
		System.out.println("Hello world");
		return "Tristan Graaff";
	}
	
	public static String getMoreData() {
		System.out.println("Hello world 3");
		return "Tristan Graaff 3";
	}
}
