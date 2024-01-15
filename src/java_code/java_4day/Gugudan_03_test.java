package java_code.java_4day;

import java.util.Scanner;

public class Gugudan_03_test {

	public static void main(String[] args) {
		/*
		 * 임의의 시작과 끝단을 입력받아 단까지 출력해주세요.
		 * 1. 시작단의 변수는 start, 끝단의 변수는 end도 정의한다.
		 * 2. start, end 변수는 모두 0이 아닌 경우에만 출력되도록 한다.
		 *    만약, start, end 변수에 하나라도 0이 입력되면 프로그램이 종료된다.
		 * 3. start가 end 보다 작은 경우 구구단 형식 단을 증가시켜 출력
		 *    만약, start가 end보다 큰 경우 구구단 형식 단을 감소시켜 출력
		 * 4. 정상적으로 프로그램이 잘 동작되면, 반복적으로 작동시킨다.
		 */

		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.print("start>");
			int start = scan.nextInt(); //시작단
			System.out.print("end>");
			int end = scan.nextInt();	//종료단

			if(start != 0 && end !=0) {
				//프로그램 실행
				if(start<end) {
					//구구단의 단을 증가시켜 출력(중첩 for) : 2~5단
					for(int hang=1;hang<=9;hang++) {
						for(int dan=start;dan<=end;dan++) {
							System.out.print(dan+"*"+hang+"="+(dan*hang)+"\t");
						}//inner for
						//한 행 출력 후 다음줄로 이동
						System.out.println();
					}//outer for

				}else {
					//구구단의 단을 감소시켜 출력(중첩 for) : 5~2단
					for(int hang=1;hang<=9;hang++) {
						for(int dan=start;dan>=end;dan--) {
							System.out.print(dan+"*"+hang+"="+(dan*hang)+"\t");
						}//inner for
						//한 행 출력 후 다음줄로 이동
						System.out.println();
					}//outer for
				}
			}else {
				//프로그램 종료
				System.out.println("-- 프로그램 종료 --");
				System.exit(0);
			}

		}//while

	}//main

}//class
