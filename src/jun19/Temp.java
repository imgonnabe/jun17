package jun19;

// 주소록 만들기
import java.util.ArrayList;

class Human {
	String name;
	String tel;

	public Human(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

public class Temp {
	public static void main(String[] args) {
		// 제네릭에는 R타입형태만 적는다.
		ArrayList<Human> arr01 = new ArrayList<Human>();
		arr01.add(new Human("홍길동", "010-1234-5678"));
		arr01.add(new Human("김나래", "010-1454-5754"));
		arr01.add(new Human("임길동", "010-5554-7885"));
		arr01.add(new Human("정길동", "010-7541-5555"));
		arr01.add(new Human("박길동", "010-8888-3333"));

//		Human h = new Human("김길동", "010-1111-2222");
//		arr01.add(h);

		System.out.println(arr01);

		for (Human human : arr01) {
			System.out.println(human.name + " : " + human.tel);
		}
	}

}
