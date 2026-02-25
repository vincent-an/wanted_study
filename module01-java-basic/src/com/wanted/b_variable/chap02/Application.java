package com.wanted.b_variable.chap02;

public class Application {

    public static void main(String[] args) {

        /** 형 변환
         * 형변환(Type Conversion)은 프로그래밍에서 데이터 타입을
         * 다른 데이터 타입으로 변환하는 과정을 의미한다.
         * 형변환은 크게 두 가지 주요 방식으로 나눌 수 있는데
         * 암시적 형변환 vs 명시적 형변환
         *
         * 암시적 형변환
         * - 작은 범위의 데이터 타입에서 큰 범위의 데이터 타입으로 자동으로 변환되는 과정을 의미한다.
         * - int (4byte) -> dobule (8byte)의 경우, 데이터 손실이 발생하지 않는다.
         *
         * 명시적 형변환
         * - 데이터 손실 가능성이 있다!
         * - 따라서 데이터 타입 선택 시, 값의 범위와 필요 정확도를 고려해야된다.
         * *참고*
         *  과거에는 컴퓨터(하드웨어) 성능이 좋지 않기 때문에 자료형 선택이 신중했다.
         *  다만 하드웨어의 발전에 따라 최근에는 그다지 신경쓰지 않는다.
         *
         *  - 가장 많이 사용하는 자료형
         *  정수 - int, 실수 - double,
         */

        // 명시적 형변환 예시
        System.out.println("====명시적 형변환 실행=====");
        double dNum = 99.99;
        int iNum = (int) dNum; // 손실을 감수하고 변경하겠다.
        System.out.println("iNum : " + iNum);

        // 암시적 형변환
        System.out.println("====자동 형변환(암시적 형변환) 실행=====");
        byte bNum = 100;
        short sNum = bNum;
        int iNum2 = sNum;
        double dNum2 = iNum2;
        System.out.println("dNum2 = " + dNum2);
    }
}
