package java_code.java_4day;

public class Gugudan_02 {

	public static void main(String[] args) {
		// 가로형 구구단
		// hint_for문이 2개 나옴

		/*
		* 2*1 = 2 3*1 = 3 ~ 9*1 = 9
		* 2*2 = 4 3*2 = 6 ~ 9*2 = 18
		* ... ... ~
		* 2*9 = 18 3*9 = 27 9*9 = 81
		*/

		System.out.println("---- 구구단 ----");

		for (int i=1;i<10;i++) {
			for (int j=2;j<10;j++) {
				System.out.print(j + "*" + i + " = " + (j*i) + "\t");
			}
			System.out.println();
		}
	}

}
