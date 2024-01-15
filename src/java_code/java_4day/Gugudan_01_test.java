package java_code.java_4day;

import java.util.Scanner;

public class Gugudan_01_test {

	public static void main(String[] args) {
		/*
		 * 1. 2단 출력하기
		 * 2. 임의의 단 입력받아 출력하기
		 * 3. 입력받은 단이 9인지 체크하기
		 * 4. 임의의 구구단을 계속 입력받기
		 * 5. 한 단 출력 후 계속 진행여부 체크 후 q 입력시 종료
		 */

		// 1. 2단 출력하기
		for (int i=1;i<10;i++) {
			System.out.println("2*" + i + " = " + (2*i));
		}

		// 2. 임의의 단 입력받아 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력해 주세요.> ");
		int dan = scan.nextInt();

		boolean flag = true;

		while (flag) {
			// 3. 입력받은 단이 9인지 체크
			if (dan == 9) {
				System.out.println("입력하신 숫자는 9입니다.");
				System.out.println("한번 더 입력해주세요.");

				// 4. 임의의 구구단을 계속 입력 받기
				dan = scan.nextInt();
			}

			for (int i=1;i<10;i++) {
				System.out.println(dan + "*" + i + " = " + (dan*i));
			}

			System.out.println("계속 입력하시겠습니까?");
			System.out.print("(q입력시 종료)");

			String con = scan.next();

			if (!con.equals("q")) {
				System.out.print("단을 입력해 주세요.> ");
				dan = scan.nextInt();
			} else {
				System.out.println("== 종료 ==");
				flag = false;
			}


		}
		scan.close();
	} // main

} // class
