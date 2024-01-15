package java_code.java_4day;

import java.util.Scanner;

public class ControlFlow_for문3 {

	public static void main(String[] args) {
		// 키보드를 통해 입력받은 값으로
		// 임의의 수를 입력받아
		// 키보드를 통해 초기값과 최종값을 입력받아 반복을 실행해 보세요.

		// 초기값:1, 최종값:10
		Scanner scan = new Scanner(System.in);

		System.out.println("초기값> ");
		int snum = scan.nextInt();
		System.out.println("최종값> ");
		int fnum = scan.nextInt();

		// 실행은 최종값이 초기값보다 큰 경우에만 실행하도록 한다. 1~100
		if(snum<fnum) {
			int sum = 0;

			for(int i=sum;i<fnum+1;i++) {
				sum += i;
			}

			System.out.println("합계 = " + sum);
		} else {
			System.out.println("실행은 최종값이 초기값보다 큰 경우에만 실행됩니다.");
		}
	}


}






