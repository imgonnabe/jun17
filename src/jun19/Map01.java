package jun19;

import java.util.HashMap;
import java.util.Set;

/*
 * List: 중복허용, 순서가 있다.
 * set: 중복 x, 순서 x
 * Map: 키와 값으로 저장한다. 쌍으로 저장한다.
 * 		키는 중복될 수 없다. 값은 중복 가능하다.
 */
public class Map01 {
	public static void main(String[] args) {
		//        Key    Value = 사전
		HashMap<String, String> map01 = new HashMap<String, String>();
		map01.put("사과", "사과입니다.");
		map01.put("배", "배입니다.");
		map01.put("토마토", "배입니다.");
		map01.put("사과", "사과라고 저장합니다.");

		System.out.println(map01);
		System.out.println(map01.get("토마토"));// 배입니다.
		System.out.println(map01.get("포도"));// null (key를 넣어야 value가 나옴)

		System.out.println(map01.size());// 3
		System.out.println(map01.isEmpty());// false
		// System.out.println(map01.remove("사과"));// 삭제된다.
		System.out.println(map01);

		// keySet(): key를 뽑는다.
		Set<String> ks = map01.keySet();
		System.out.println(ks);// [배, 토마토, 사과]
		
		for (String str : ks) {// 키만 뽑기
			System.out.println(map01.get(str));// 키를 통해 value 뽑기
		}
		
		System.out.println(map01.values());// 값만 뽑기 > [배입니다., 배입니다., 사과라고 저장합니다.]
		
		System.out.println(map01.containsKey("바나나"));// false
		System.out.println(map01.containsKey("사과"));// true
		
		System.out.println(map01.containsValue("바나나입니다."));// false
		System.out.println(map01.containsValue("배입니다."));// true
		
//		map01.clear();
//		System.out.println(map01);
		
		map01.replace("토마토", "토마토입니다.");
		System.out.println(map01);// {배=배입니다., 토마토=토마토입니다., 사과=사과라고 저장합니다.}

	}

}
