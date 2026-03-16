package com.wanted.a_generic.b_use;

public class Rabbit extends Mammal{

    public void cry() {
        System.out.println("토끼가 울부짖습니다. 끽끽!");
    }

    @Override
    public void eat() {
        System.out.println("[eat] 토끼가 풀을 뜯어먹습니다.. 냠냠");
    }
}
