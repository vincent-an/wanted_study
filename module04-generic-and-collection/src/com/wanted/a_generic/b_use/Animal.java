package com.wanted.a_generic.b_use;

public interface Animal {

    // 해당 인터페이스를 상속받는 Mammal(포유류) 클래스 생성

    public void eat();

    public static void sleep() {
        System.out.println("[static]밥 먹어라");
    }
}
