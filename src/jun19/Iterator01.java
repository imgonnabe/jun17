package jun19;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator01 {
	public static void main(String[] args) {
		System.out.println("List 생성");
		ArrayList<String> list = new ArrayList<String>();
		list.add("일");
		list.add("월");
		list.add("수");

		Iterator<String> iter = list.iterator();

		while (iter.hasNext() == true) {
			String day = iter.next();
			if (day == "수") {
				iter.remove();
				System.out.println("Day : " + day);
			}
			System.out.println("Day : " + day);
		}

		System.out.println("-------------------");

		iter = list.iterator();

		while (iter.hasNext() == true) {
			String day = iter.next();
			System.out.println("Day : " + day);
		}
	}
}
