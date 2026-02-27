package com.wanted.object.b_array;

import java.util.Arrays;

public class Application01 {
    public static void main(String[] args) {
        /**
         * comment, 배열이란?
         * 동일한 자료형의 묶음이다.
         * 여기서 핵심 키포인트는 동일한 자료형이다!
         * 배열은 heap 영역에 생성이되며, new연산자(할당 연산자)를 통해 할당한다.
         */

        /**
         * comment, 배열의 사용이유
         * 1. 배열을 사용하지 않는다면, 변수를 여러 개 만들어야 한다.
         * 2. 각각의 변수는 규칙이 없기 때문에 반복문을 통한 연속처리가 불가능하다.
         * --------------
         * comment, 배열의 사용 방법
         * 1. 자료형[] 변수명; , 자료형 변수명[] // 선언
         * 2. new int[크기]; , { 값들 } // 할당
         * int[] x = new int[6];
         * int[] y = {1, 2, 3, 4, 5}
         */
        
        int[] iarr = new int[5];
        System.out.println("iarr = " + iarr);
        System.out.println("iarr의 길이 = " + iarr.length);

        // 배열에 들어있는 값에 접근하는 방법
        System.out.println(iarr[0]);

        /**
         * comment,
         *  배열은 heap영역에 생성되는데,
         *  heap영역은 빈 값을 허용하지 않기 때문에, 기본값 0이 할당된다.
         *  ---
         * 정수 : 0
         * 실수 : 0.0
         * 논리 : false
         * 문자 : 유니코드
         * 참조 : null
         */

        // 10개의 정수가 들어갈 수 있는 배열 생성
        int[] iarr2 = new int[10];

        // 초기값을 0부터 세팅하는 이유 : 배열은 index 번호 체계를 갖는다.
        for (int i = 0; i < iarr2.length; i++) {
            System.out.println("iarr2[" + i +"] 공간의 값 : " + iarr2[i]);
        }

        String[] sarr = new String[5];
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i +"] 공간의 값 : " + sarr[i]);
        }

        // 배열의 값에 접근하는 방식 : 변수명[index]
//        System.out.println("NullPointerException 발생 : " + sarr[4].length());
    }
}
