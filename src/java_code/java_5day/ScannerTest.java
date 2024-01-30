package java_code.java_5day;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		// 홍길동의 성적을 입력받아, 총점과 평균을 출력해주세요.
		// 입력시, 학생명, 국어, 영어, 수학 점수를 입력받아 처리한다.

		Scanner scan = new Scanner(System.in);

		double tot = 0.0; // 총합산
		double avg = 0.0; // 평균

		System.out.print("학생명 > ");
		String name = scan.next();

		System.out.print("국어 > ");
		int kor = scan.nextInt();

		System.out.print("영어 > ");
		int eng = scan.nextInt();

		System.out.print("수학 > ");
		int math = scan.nextInt();

		tot = kor + eng + math;
		avg = tot / 3.0;

		System.out.println("'" + name + "'" + "의 점수");
		System.out.println("국어\t영어\t수학\t\t총점\t\t평균");
		System.out.println("-----------------------------------------");
		System.out.print(kor + "\t" + eng + "\t" + math + "\t\t" + tot + "\t" + avg);

		scan.close();

	}
}









