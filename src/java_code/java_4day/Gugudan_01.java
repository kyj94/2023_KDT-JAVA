package java_code.java_4day;

import java.util.Scanner;

public class Gugudan_01 {

	public static void main(String[] args) {
		// 임의의 수를 입력받아, 그 수를 구구단으로 출력해주세요.
		// 2단을 출력해주세요.
		// 2*1 = 2
		// 2*2 = 4
		// ....
		// 2*9 = 18

		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.print("구구단 입력> ");
			int dan = scan.nextInt();

			// 입력받은 dan의 값이 0보다 큰 경우에만 실행, 0인 경우 메시지 출력
			if (dan>0) {
				System.out.println("==" + dan + "단 출력==");

				for (int i=1; i<=9;i++) {
					System.out.println(dan + "*" + i + " = " + (dan*i));
				}
			} else {
				System.out.println("0단은 출력되지 않습니다.");
			}

			System.out.print("계속 진행하겠습니까?(종료시 q) > ");

			String con = scan.next();

			if (con.equals("q")) {
				flag = false;
			}
		}

		System.out.println("-- 프로그램 종료 --");
		scan.close();
	}

}
