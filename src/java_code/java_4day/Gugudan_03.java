package java_code.java_4day;

public class Gugudan_03 {

	public static void main(String[] args) {
		// 임의의 구구단 출력하기
		// 2~5단까지 출력해주세요.
		// 2*1 = 2 3*1 = 3 ~ 5*1 = 5

		for(int i=1;i<10;i++) {
			for(int j=2;j<6;j++) {
				System.out.print(j + "*" + i + " = " + (j*i) + "\t");
			}
			System.out.println();
		}
	}
}