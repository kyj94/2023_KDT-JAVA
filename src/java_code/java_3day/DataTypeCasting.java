package java_code.java_3day;

public class DataTypeCasting {

	public static void main(String[] args) {
		// 묵시적 형변환
		short s = 10; // 2byte
		int i = s; // 4byte
		double d1 = i; // 8byte
		double d2 = s; // 8byte
		
		// 명시적 형변환
		int i2 = 1000; // 4byte
		// short s2 = i2; // 오류발생 // 2byte
		short s2 = (short) i2; // 오류해결
	}

}
