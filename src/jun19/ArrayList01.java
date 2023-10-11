package jun19;

import java.util.ArrayList;

// 자료구조
// 컬랙션 하위 arrayList타입
// 이름도 배열이 들어간다. 배열과 흡사
public class ArrayList01 {
	public static void main(String[] args) {
		// 배열 선언
		int[] arr = new int[10];

		// List > ArrayList
		ArrayList<Integer> arr01 = new ArrayList<Integer>();

		// 값 대입 = add()
		arr01.add(10);
		arr01.add(15);// arr01 [ 10, 15 ]
		arr01.add(20);
		int num = 100;
		arr01.add(num);
		for (int i = 1; i <= 10; i++) {
			arr01.add(i);
		}
		System.out.println(arr01);
		
		// get()
		int num1 = arr01.get(0);
		System.out.println(num1);
		System.out.println(arr01.get(3));

		// 길이 뽑기
		System.out.println(arr01.size());
		System.out.println(arr01.get(arr01.size() - 1));

		// for문 이용해서 출력하기
		for (int i = 0; i < arr01.size(); i++) {
			System.out.println(arr01.get(i));
		}

		// list타입 arr02
		// 20이하 홀수
		ArrayList<Integer> arr02 = new ArrayList<Integer>();
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 1) {
				arr02.add(i);

			}
		}
		System.out.println(arr02);


	}

}
