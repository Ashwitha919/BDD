package chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WaterBottle {

	public static void main(String[] args) {

		// String letters = "abcdef";
		// System.out.println(letters.length());
		// System.out.println(letters.charAt(3));
		// System.out.println(letters.charAt(6));

		// String numbers = "012345678";
		// System.out.println(numbers.substring(1, 3));
		// System.out.println(numbers.substring(7, 6));
		// System.out.println(numbers.substring(7));

		// int total = 0;
		// StringBuilder letters = new StringBuilder("abcdefg");
		// total += letters.substring(1, 2).length();
		// total += letters.substring(6, 6).length();
		// total += letters.substring(6, 5).length();
		// System.out.println(total);

		// StringBuilder numbers = new StringBuilder("0123456789");
		// numbers.delete(2, 8);
		// numbers.append("-").insert(2, "+");
		// System.out.println(numbers);
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		for(String s:hex)
			System.out.println(s);
		int x = Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F");
	//	System.out.println(x + " " + y + " " + z);

	}

}
