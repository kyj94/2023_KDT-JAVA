package java_code.java_3day;

public class ArthmaticTest_증감연산자 {

	/*
	 * 증감(단항) 연산자는 for문과 count 변수에서 사용됨
	 */

	public static void main(String[] args) {
		int i = 10;
		System.out.println("i = " + i); // 10
		System.out.println(("i++ = " + i++)); // 출력이 된 후 ++처리가 됨
		// 즉, i++ = 10으로 출력됨 // 10

		System.out.println("i = " + i); // 11
		System.out.println(("++i = " + ++i)); // 12
		// ++처리 후 출력

		System.out.println("--i = " + --i); // 11
		System.out.println(("i-- = " + i--)); // 11
		System.out.println("i = " + i); // 10
	}

}