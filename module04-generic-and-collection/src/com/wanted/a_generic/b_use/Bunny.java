package com.wanted.a_generic.b_use;

public class Bunny extends Rabbit{

    @Override
    public void cry() {
        System.out.println("바니바니 당근당근");
    }

    @Override
    public void eat() {
        System.out.println("[eat] 바니바니가 당근당근을 먹습니다~ 냠냠");
    }
}
