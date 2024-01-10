package java_code.java_3day;

public class ArthmaticTest_논리연산자 {

    public static void main(String[] args) {
        // *조건식1(5>3), 조건식2(10<5) → 논리합, 논리곱
        // (5>3)||(10<5) → true||false → true //이런 경우가 계산이 더 빠름 → shortcut 연산
        // (10<5)||(5>3) → false||true → true

        // (5>3)&&(10<5) → true&&false → false
        // (10<5)&&(5>3) → false&&true → false // shortcut

        System.out.println((5>3)||(10<5)); // true(shortcut)
        System.out.println((10<5)||(5>3)); // true

        System.out.println((5>3)&&(10<5)); // false
        System.out.println((10<5)&&(5>3)); // false(shortcut)
        //노란줄은 shortcut이기 때문에 뜸
    }

}
