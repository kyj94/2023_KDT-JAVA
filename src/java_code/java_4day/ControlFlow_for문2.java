package java_code.java_4day;

public class ControlFlow_for문2 {

	public static void main(String[] args) {
		// 1에서 100까지의 합계를 출력하시오.

		int sum = 0;
		for(int i=1;i<101;i++) {
			// i의 누적합을 구해 sum에 저장
			sum += i; // sum = sum + i
		}
		System.out.println("합계 = " + sum);
	}

}
