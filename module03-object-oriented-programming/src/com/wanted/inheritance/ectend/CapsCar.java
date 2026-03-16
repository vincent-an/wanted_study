package com.wanted.inheritance.ectend;

// extends 키워드는 클래스 선언부에 작성한다.
public class CapsCar extends Car {

    public CapsCar() {
        System.out.println("CapsCar의 기본 생성자 호출됨...");
    }

    @Override
    public void run() {
        System.out.println("경찰차는 삐용삐옵ㅇ요옹 하면서 달립니다~~~~~~~~~");
    }

    @Override
    public void soundHorn() {
        System.out.println("경찰차는 이에에에에에에엥ㅇ 경적을 울립니다. 비키세요 ");
    }
}
