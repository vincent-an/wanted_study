package com.wanted.c_method;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {
        /**
         * comment. 다른 클래스에 존재하는 메소드 출력하기.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 수를 입력해주세요 : ");
        int second = sc.nextInt();
        sc.nextLine();

        // 계산기 클래스 내부에 있는 메소드를 사용할 준비
        Calculator calc = new Calculator();

        // 최솟값 호출
        int min = calc.minNumberOf(first, second);

        /**
         * comment. static으로 선언한 메소드 호출 방법 맛보기
         * 다른 클래스에 작성한 static 메소드의 경우 호출 시
         * 클래스명을 반드시 기술해야 한다.
         * - 사용방법 : 클래스명.메소드명();
         */
        int max = Calculator.maxNumberOf(first, second);

        System.out.println("두 수 중 최솟값은: " + min + "입니다!");
        System.out.println("두 수 중 최댓값은: " + max + "입니다!");
    }

}
