package com.wanted.c_operlators;

public class Application {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // +, -, *, /, %
        // 산술 연산
        // 여기서 괄호를 빼면, 103이 나옴 why? 문자열 + 정수 + 정수 = 문자열 + 정수 = 문자열
        System.out.println("덧셈 : " + ( a + b));
        System.out.println("나눗셈 : " + ( a / b));
        System.out.println("나머지 : " + ( a % b));

        // 비교 연산
        // 두 값을 비교하여 참, 거짓으로 반환
        // <, >, !=, =, <=, >=
        boolean isGreator = a > b;
        System.out.println("isGreator = " + isGreator);

        // 논리 연산자
        // 하나 이상의 "조건을 결합" 하여 최종적인 참 또는 거짓을 평가한다.
        // && (논리 and), || (논리 or), ! (논리 not)
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("둘 다 참인가? : " + (isFalse && isTrue));
        System.out.println("둘 중 하나가 거짓인가? : " + (isTrue || isFalse));
        System.out.println("NOT은 너가 거짓이라는 것을 부정한다 : " + !isFalse);
        System.out.println();

        // 증강 연산자
        // 변수의 값을 1씩 증가 시키거나 감소시키는 연산자
        // ++ (증가), --(감소)
        int age = 20;
        int level = 30;
        System.out.println("====증강 연산자 실행====");
        System.out.println("첫 실행, age = " + age); // age = 20

        System.out.println("전위 증감자 실행, age = " + (++age)); // age = 21

        System.out.println("후위 증감자 실행, age = " + (age++)); // age = 21

        System.out.println("중간 값 level = " + level);

        System.out.println("최종 결과, age = " + age); // 이제 age = 22

    }
}
