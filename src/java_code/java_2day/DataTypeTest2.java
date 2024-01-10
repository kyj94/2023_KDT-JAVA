package java_code.java_2day;

public class DataTypeTest2 {

	public static void main(String[] args) {
		// 로컬(지역, 멤버) 변수 정의

		// 4바이트 정수형 변수 num에 100을 저장
		int num = 100;

		// 8바이트 실수형 변수 fnum에 3.14를 저장
		double fnum = 3.14;

		// 1바이트 문자형 변수 s1에 '홍'을 저장
		char s1 = '홍';

		// 기본 문자형 변수 s2에 "홍길동"을 저장
		String s2 = "홍길동";
		
		// 객체 타입 문자형 변수 s3에 "홍길동"을 저장
		String s3 = new String("홍길동");

		System.out.println("num = " + num);
		System.out.println("fnum = " + fnum);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s2 == s3 -->" + (s2 == s3));
		// s2는 Stack에 저장, s3는 Heqp에 저장되기 떄문에

		System.out.println("s2.equal(s3) --> " + (s2.equals(s3)));
		//문자열만으로 비교

		System.out.println(s3.hashCode());
		// Heqp에 저장된 주소값
	}

}
