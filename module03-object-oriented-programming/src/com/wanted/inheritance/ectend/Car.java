package com.wanted.inheritance.ectend;

public class Car extends CarCar{

    // 달리는 상태 체크
    private Boolean runningStatus = false;

    @Override
    public void papa() {
        System.out.println("부모입니다....");
    }

    public Car() {
        System.out.println("Car Class 기본 생성자 호출 됨.");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달려갑니다~~~~~");
    }

    // 달리는 상태를 반환해주는 메서드
    public boolean isRunning() {
        return runningStatus;
    }

    // 경적을 울리는 메서드
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빵~~~~빵!!");
        } else {
            System.out.println("주행 중이 아니여서 경적을 울릴 수 없습니다.");
        }
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다....");
    }
}
