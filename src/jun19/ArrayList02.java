package jun19;

// Generic
// 클래스 선언부에 <E>, <T>, <K, V>가 붙어있는 경우가 있다.
// 이런 인터페이스, 추상 클래스, 클래스를 제네릭이라고 한다.
// 자바 1.5부터 추가된 기능이다.
// <E> element, 구성요소(데이터 타입)를 적는다.
// <T> Type
// <K, V> Key, Value
// 이 기호를 사용해서 데이터 타입을 선언할 수 있다.
// 정해지지 않은 데이터 타입은 제네릭으로부터 객체가 생성할 때 결정된다.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {
	public static void main(String[] args) {
		ArrayList<Integer> arr01 = new ArrayList<Integer>();

		for (int i = 10; i < 16; i++) {
			arr01.add(i);
		}

		arr01.add(0, 100);// 0번지에 추가
		// 마지막 번지수에 50을 넣는다.
		System.out.println(arr01);
		System.out.println(arr01.size());
		arr01.add(arr01.size(), 50);
		System.out.println(arr01);
		System.out.println(arr01.size());

		// 삭제 remove(int index)
		System.out.println(arr01.remove(0));// 100
		System.out.println(arr01);
		System.out.println(arr01.size());

		System.out.println(arr01.remove(3));// 13
		System.out.println(arr01);
		System.out.println(arr01.size());

		arr01.add(3, 13);
		System.out.println(arr01);

		ArrayList<String> arr02 = new ArrayList<String>();
		arr02.add("홍길동");
		arr02.add("김길동");
		arr02.add("이길동");
		arr02.add("박길동");

		// remove(value)
		System.out.println(arr02.remove("홍길동"));// true
		System.out.println(arr02.remove("홍길동"));// false

		// indexOf()
		System.out.println(arr02.indexOf("김길동"));// 0
		System.out.println(arr02.indexOf("김나래"));// -1
		System.out.println(arr02);
		
		// contains(value): 요소에 있는지 확인하기
		System.out.println(arr02.contains("김나래"));// false
		
		// set(index, value)
		arr02.set(0, "황길동");// 김길동 > 황길동
		System.out.println(arr02);
		
		// 정렬
		Collections.sort(arr02);
		System.out.println(arr02);
		
		ArrayList<String> arr04 = new ArrayList<String>(arr02);
		System.out.println("arr04: " + arr04);// arr04: [박길동, 이길동, 황길동]
		arr02.set(1, "김나래");
		System.out.println("arr02: " + arr02);// arr02: [박길동, 김나래, 황길동]
		System.out.println("arr04: " + arr04);// arr04: [박길동, 이길동, 황길동]

		// clear
		arr02.clear();
		System.out.println(arr02.size());// 0
		
		// 0~9까지 랜덤하게 5개 저장하는 list 만들기
		ArrayList<Integer> arr03 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			arr03.add((int)(Math.random() * 10));
		}
		System.out.println(arr03);
		
		Collections.sort(arr03);// 오름차순
		System.out.println(arr03);
		
		Collections.reverse(arr03);// 내림차순
		System.out.println(arr03);
		
		Collections.shuffle(arr03);// 랜덤
		System.out.println(arr03);

	}

}
