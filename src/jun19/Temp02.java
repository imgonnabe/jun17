package jun19;

import java.util.HashSet;
import java.util.Iterator;

public class Temp02 {
	public static void main(String[] args) {
		// String타입을 저장하는 set을 만든다.
		HashSet<String> set01 = new HashSet<String>();
		set01.add("사과");
		set01.add("복숭아");
		set01.add("포도");
		set01.add("토마토");
		set01.add("수박");
		set01.add("참외");
		set01.add("배");
		set01.add("사과");

		System.out.println(set01);
		System.out.println(set01.size());
		
		for (String str : set01) {
			System.out.println(str);
		}
		
		System.out.println("------------------------------");
		// Iterator 반복자로 형태 변환 후 출력하기
		Iterator<String> it = set01.iterator();
		// hasNext(): 읽어올 요소가 있는지 참/거짓으로 반환
		// next(): 다음 데이터를 읽어온다.
		// remove(): next()로 읽어온 요소를 삭제한다.
		
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
			
		}
	}

}
