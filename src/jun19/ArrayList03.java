package jun19;

import java.util.ArrayList;

public class ArrayList03 {
	public static void main(String[] args) {
		ArrayList<String> arr01 = new ArrayList<String>();

		arr01.add("Java");
		arr01.add("JDBC");
		arr01.add("Servlet/JSP");
		arr01.add(2, "Database");
		arr01.add("iBATIS");
		System.out.println(arr01);

		int size = arr01.size();
		System.out.println("총 객체수: " + size);
		System.out.println();

		String skill = arr01.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < arr01.size(); i++) {
			String str = arr01.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		arr01.remove(2);
		arr01.remove(2);
		arr01.remove("iBATIS");

		for (int i = 0; i < arr01.size(); i++) {
			String str = arr01.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
