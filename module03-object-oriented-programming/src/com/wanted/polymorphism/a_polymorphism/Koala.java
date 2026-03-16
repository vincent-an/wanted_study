package com.wanted.polymorphism.a_polymorphism;

public class Koala extends Animal{
    @Override
    public void eat() {
        System.out.println("코알라가 나뭇잎을 먹다가...잠..들..었....ㅇ...zzz");
    }

    @Override
    public void run() {
        System.out.println("코알라가 다른 나무로 폴~짝 뛰다가 잠...들...었....zzz");
    }

    @Override
    public void bark() {
        System.out.println("우훙우훙");
    }

    public void sleep() {
        System.out.println("코알라는 하루에 20시간을 숙면합니다....zzz");
    }
}
