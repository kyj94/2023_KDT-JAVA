package java_code.java_5day;

import java.util.Scanner;

public class ModulerTest2 {

	public static void main(String[] args) {

		// 임의의 정수값을 입력받아 정수값이 홀수인지 짝수인지 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요> ");

		int val = scan.nextInt();

		if(val %2 == 0) {
			//짝수
			System.out.println("짝수");
		} else {
			//홀수
			System.out.println("홀수");
		}
	}
}
