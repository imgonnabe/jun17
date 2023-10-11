package jun19;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {
	public static void main(String[] args) {
		// key = id   value = pw
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("admin", "01234567");
		map.put("root", "01234567");
		map.put("test", "testtest");
		map.put("admin", "admin01234");// key중복

		Scanner sc = new Scanner(System.in);

		boolean ch = true;
		while (ch) {
			System.out.print("아이디를 입력하세요: ");
			String id = sc.next();

			System.out.print("암호를 입력하세요: ");
			String pw = sc.next();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("일치합니다.");
					ch = !ch;
				} else {
					System.out.println("암호 불일치");
				}
			} else {
				System.out.println("아이디가 없습니다.");
			}

		}

	}

}
