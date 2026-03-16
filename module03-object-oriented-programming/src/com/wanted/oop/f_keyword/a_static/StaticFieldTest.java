package com.wanted.oop.f_keyword.a_static;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int StaticCount;

    // 기본 생성자
    public StaticFieldTest() {}

    public static int getStaticCount() {
        return StaticCount;
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    /*각 필드를 호출 시 마다 1씩 증가시키는 용도의 메서드*/
    public void increaseNonStatic() {
        this.nonStaticCount++;
    }

    public void increaseStatic() {
        StaticFieldTest.StaticCount++;
    }
}
