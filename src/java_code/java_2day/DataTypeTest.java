package java_code.java_2day;

import java.util.Scanner;

public class DataTypeTest {

	public static void main(String[] args) {
		// 변수 정의(기본형): 데이터 타입(자료형) 변수명 = 데이터 값;
		int number = 100;

		// float fnumber = (float)10.5; -- 기본타입이 double여서 오류 발생
		// 실수 앞에 (float)를 적으면 해결됨
		float fnumber = 10.5F; // 또는 F를 붙힘
		char cstr = 'A';
		String str = "안녕";

		int num1 = 100;
		int num2 = 200;
		int sum = num1 + num2;

		// 변수 정의(참조형): 데이터 타입(클래스) 변수명 = new 클래스의 생성자;
		// String a = new String();
		String str2 = new String("안녕");
		Scanner scan = new Scanner(System.in);

		//출력
		System.out.println("sum = " + sum);
		System.out.println("sum = " + (num1 + num2)); // sum = 300
		System.out.println("number = " + number);
		System.out.println("number"); // 큰따옴표 안에 넣으면 그 문자대로만 출력됨
		System.out.println("fnumber = " + fnumber);
		System.out.println("cstr = " + cstr);
		System.out.println("str = " + str);

		System.out.println("str2 = " + str2);
		System.out.println(scan);
	}

}
