package java_introduction;

import java.util.ArrayList;

public class JavaBasics {

	public static void main(String[] args) {
		int myNum = 5;
		String website = "Tristan Graaff";
		char letter = 'r';
		double complexNumer = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + " is an int value");
		System.out.println(website);
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(arr[1]);
		
		int[] arr2 = {1, 2, 3, 4, 5};
		
		System.out.println(arr2[2]);
		
		//for loop
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] names = {"Rahul", "Tristan", "James"};
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String s: names) {
			System.out.println(s);
		}
		
		int[] arr3 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};
		for(int i = 0; i < arr3.length; i++) {
			if (arr3[i] % 2 == 0) {
				System.out.println(arr3[i]);
				break;
			} else {
				System.out.println(arr3[i] + " is not a multiple of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Tristan");
		a.add("Webspace");
		a.add("Jimmy");
		a.remove(2);
		System.out.println(a.get(1));
	}
}
