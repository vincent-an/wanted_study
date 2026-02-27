package com.wanted.c_method;

public class Calculator {

    /* comment. 계산을 잘할 수 있는 메소드들의 집합체 */

    // 전달 받은 두 수를 비교해서 최솟값 반환하는 메소드
    public int minNumberOf(int num1, int num2) {
//        return (num1 > num2 ? num2 : num1); // 삼항 연산자 풀이
        return Math.min(num1, num2);
    }

    // 전달 받은 두 수를 비교해서 최댓값 반환하는 메소드
    public static int maxNumberOf(int num1, int num2) {
//        return (num1 > num2 ? num1 : num2); // 삼항 연산자 풀이
        return Math.max(num1, num2);
    }

//    // 전달 받은 두 수 곱셈 메소드
//    public int multipNumberOf(int num1, int num2) {
//
//    }
//
//    // 전달 받은 두 수 곱셈 메소드
//    public int divisionNumberOf(int num1, int num2) {
//
//    }
}
