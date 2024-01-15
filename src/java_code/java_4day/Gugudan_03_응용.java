package java_code.java_4day;

import java.util.Scanner;

public class Gugudan_03_응용 {

	public static void main(String[] args) {
		// 임의의 구구단 출력하기
		// 2~5단까지 출력해주세요.
		// 2*1 = 2 3*1 = 3 ~ 5*1 = 5

		Scanner scan = new Scanner(System.in);
		System.out.print("첫단: ");
		int fnum = scan.nextInt();
		System.out.print("끝단: ");
		int lnum = scan.nextInt();

		for(int i=1;i<10;i++) {
			for(int j=fnum;j<=lnum;j++) {
				System.out.print(j + "*" + i + " = " + (j*i) + "\t");
			}
			System.out.println();
		}
	}
}