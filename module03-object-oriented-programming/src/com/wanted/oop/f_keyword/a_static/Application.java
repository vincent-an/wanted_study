package com.wanted.oop.f_keyword.a_static;

public class Application {
    public static void main(String[] args) {

        /**
         * comment, static 키워드에 대해 알아보자.
         */

        StaticFieldTest st1 = new StaticFieldTest();

        System.out.println("non-static 변수 확인 : " + st1.getNonStaticCount());
        System.out.println("static 변수 확인 : " + st1.getStaticCount());

        st1.increaseNonStatic();
        st1.increaseStatic();

        System.out.println("non-static 변수 확인 : " + st1.getNonStaticCount());
        System.out.println("static 변수 확인 : " + StaticFieldTest.getStaticCount());

        /* comment, 핵심 포인트
        *  새로운 StaticFieldTest 객체를 생성
        *  sout 구문을 실행했을 때 0,0 이 나오는 것을 기대했지만,
        *  실제로 static 키워드가 붙은 변수는 1이 출력 되었다.
        * */

        System.out.println("======= 새로운 객체 생성 및 초기화 ========");

        StaticFieldTest st2 = new StaticFieldTest();

        System.out.println("non-static 변수 확인 : " + st2.getNonStaticCount());
        System.out.println("static 변수 확인 : " + StaticFieldTest.getStaticCount());

    }
}
