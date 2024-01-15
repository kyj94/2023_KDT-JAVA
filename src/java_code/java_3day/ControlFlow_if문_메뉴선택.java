package java_code.java_3day;

import java.util.Scanner;

public class ControlFlow_if문_메뉴선택 {

	/*
	* 점심메뉴 선택1: 된장찌게, 2: 김치찌게, 3: 돈까스, 4: 자장면
	*/

	public  static void main(String[] args) {
		// 1. 메뉴판 출력
		System.out.println("-- 점심 메뉴 리스트 --");
		System.out.println("1. 된장찌게");
		System.out.println("2. 김치찌게");
		System.out.println("3. 돈까스");
		System.out.println("4. 자장면");
		System.out.println("** 메뉴선택은 숫자로 해주세요. **");
		System.out.println("-----------------------------");

		// 2. 메뉴 입력을 위한 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴선택(숫자)> "); // In을 없애므로 줄바꾸기 안함

		int menu = scan.nextInt(); // 키보드로 입력하는 값을 스캔한
		// int로 타입을 맞춤

		// 3. 메뉴 체크
		if(menu == 1) {
			System.out.println("김치찌게가 선택되었습니다.");
		} else if(menu == 2) {
			System.out.println("된장찌게가 선택되었습니다.");
		} else if(menu == 3) {
			System.out.println("돈까스가 선택되었습니다.");
		} else if(menu == 4) {
			System.out.println("자장면이 선택되었습니다.");
		} else {
			System.out.println("숫자를 확인해주세요.");
		}

		System.out.println("-- 종료 --");
		scan.close();
	}

}
