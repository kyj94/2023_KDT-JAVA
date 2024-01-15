package java_code.java_4day;

public class ControlFlow_while문2 {

	public static void main(String[] args) {
		// 1에서 10까지의 합계를 출력해주세요.

		int i = 1; // count 변수
		int sum = 0; // 누적합계 변수

		while(i<11) {
			sum += i;
			i++;
		}

		System.out.println("합계 = " + sum);
	}

}
