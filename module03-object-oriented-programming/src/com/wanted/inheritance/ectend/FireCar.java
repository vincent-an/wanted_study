package com.wanted.inheritance.ectend;

public class FireCar extends Car{

    public FireCar() {
        System.out.println("FireCar의 기본 생성자 호출됨...");
    }

    @Override
    public void papa() {
        super.papa();
    }

    @Override
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("삐에ㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔ 비켜라 비켜");
        } else {
            System.out.println("소방차가 지나갈 수 없습니다. 다 부셔지기 전에 비키세요.");
        }
    }

    /* 부모의 것을 가져다 쓸 수 있지만, 본인만의 고유한 필드 or 메서드도 작성 가능하다. */
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ======================>>>>>>>>>>>>>>>>>>");
    }
}
