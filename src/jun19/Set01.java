package jun19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// Set: 중복, index 없다.
// ArrayList: 중복저장, 순서가 있다.
public class Set01 {
	public static void main(String[] args) {

		HashSet<Integer> set01 = new HashSet<Integer>();
		set01.add(100);
		set01.add(101);
		set01.add(102);
		set01.add(103);
		set01.add(103);

		System.out.println(set01.size());// 4
		System.out.println(set01);// [100, 101, 102, 103]

		set01.clear();
		System.out.println(set01.size());
		System.out.println(set01);

		while (set01.size() < 6) {
			set01.add((int) (Math.random() * 45) + 1);
		}
		
		System.out.println(set01.size());
		System.out.println(set01);
		
		for (Integer integer : set01) {
			System.out.println(integer);
		}
		
		// 정렬 > List로 변경하기
		ArrayList<Integer> lotto = new ArrayList<Integer>(set01);
		Collections.sort(lotto);
		System.out.println(lotto);
		
		for (int i = 0; i < lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}

	}
}
