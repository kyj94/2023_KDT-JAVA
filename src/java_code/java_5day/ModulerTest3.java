package java_code.java_5day;

import java.util.Scanner;

public class ModulerTest3 {

	public static void main(String[] args) {

		// 1. 임의의 정수값을 입력받아 정수값이 홀수인지 짝수인지 출력
		// 2. 0일 경우 실행하지 않음
		// 3. 반복 사용하기

		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		while(flag) {
			System.out.print("정수를 입력해주세요> ");
			int val = scan.nextInt();

			if(val != 0) {
				if(val %2 == 0) {
					//짝수
					System.out.println("짝수");
				} else {
					//홀수
					System.out.println("홀수");
				}
			}else {
				flag = false;
				System.out.println("0을 입력했습니다.");
				System.out.println("==프로그램 종료==");
				scan.close();
			}
		}
	}
}
