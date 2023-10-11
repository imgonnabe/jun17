package jun19;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList04 {
	public static void main(String[] args) {
		// 6칸, 1~45, 중복제거
		ArrayList<Integer> arr01 = new ArrayList<Integer>();
		arr01.add(45);
		arr01.add(40);

		// indexOf((Integer) 45)
		System.out.println(arr01.indexOf(45));
		System.out.println(arr01.indexOf(40));
		System.out.println(arr01.indexOf(10));// -1

		// contains((Integer) 40)
		System.out.println(arr01.contains(45));
		System.out.println(arr01.contains(40));
		System.out.println(arr01.contains(10));// false
		arr01.clear();

		for (int i = 0; arr01.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (!arr01.contains(num)) {
					arr01.add(num);
				}
			}
		}


//		while(arr01.size() < 6) {
//			int num = (int) (Math.random() * 45) + 1;
//			if(!arr01.contains(num)) {
//				arr01.add(num);
//			}
//		}

		Collections.sort(arr01);
		System.out.println(arr01);

	}

}
