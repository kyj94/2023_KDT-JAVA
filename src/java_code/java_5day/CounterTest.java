package java_code.java_5day;

import java.util.Scanner;

public class CounterTest {

	public static void main(String[] args) {

		// 임의의 숫자를 입력받아 홀수, 짝수의 갯수를 출력해주세요.
		// 예) 7, 1, 10, 5, 333, 65, 0[종료]
		// 결과) 홀수: 5, 짝수: 2

		// 1. 임의의 숫자를 입력받기. 단, 0을 입력시 종료
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int odd = 0; // 홀수 갯수
		int even = 0; // 짝수 갯수

		System.out.println("숫자 입력시 0이 입력되면 종료");

		while(flag) {
			System.out.println("숫자 입력(정수)> ");
			int number = scan.nextInt();

			if(number != 0) {
				// 짝수, 홀수 체크 실핵
				if(number %2 == 0) {
					System.out.println("짝수");
					even++;
				} else {
					System.out.println("홀수");
					odd++;
				}
			} else {
				flag = false;
			}
		}

		System.out.println("홀수: " + odd + "개 / " + "짝수: " + even + "개");
		System.out.println("--프로그램 종료--");

		scan.close();

	}//main
}//class







