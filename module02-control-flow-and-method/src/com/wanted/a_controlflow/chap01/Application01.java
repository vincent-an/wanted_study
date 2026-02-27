package com.wanted.a_controlflow.chap01;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /**
         * if 문
         * if문은 조건식의 결과에 따라 프로그램의 실행 흐름을 분기시키는 제어문이다.
         * 조건식이 true 일 경우 코드 블록이 수행되며, false 일 경우 코드 블럭을 무시한다.
         * 형식 : if(조건식) { 실행코드 } [else {대체 코드}]
         * 조건식은 boolean 타입으로 평가되며, 단일 조건 혹은 복합 조건(논리 연산자 사용 가능)
         * 을 포함할 수 있다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 : ");
        int score = sc.nextInt();
        sc.nextLine();

        // 만약 점수가 90점 이상이면 A등급 출력
        // 만약 점수가 90미만 80이상이면 B등급 출력
        // 80미만 70이상이면 C등급 출력
        // 그보다 낮으면 D등급 출력

        if (score >= 90) {
            System.out.println("점수는 " + score + "점, A등급입니다.");
        } else if (score <= 80) {
            System.out.println("점수는 " + score + "점, B등급입니다.");
        } else if (score <= 70) {
            System.out.println("점수는 " + score + "점, C등급입니다.");
        } else {
            System.out.println("점수는 " + score + "점, D등급입니다.");
        }

        System.out.println("프로그램을 종료합니다.");


    }
}
