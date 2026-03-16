package com.wanted.inheritance.ectend;

public class Application {
    public static void main(String[] args) {

        /**
         * comment. extend
         *  inheritance는 상속의 개념을 가지고 있다. 현실세계와 같은 개념이다.
         * (부모의 돈은 내 돈, 내 돈도 내 돈)
         * 부모가 가지고 있는 멤버(필드, 메서드)를 자식이 물려 받는다.
         * 따라서 자식은 실제로 내 것은 아니지만, 내 것처럼 사용할 것이다.
         */

        /**
         * comment. overriding 오버라이딩이란?
         * 메소드를 재정의 하는 것이다.
         * 부모가 가지는 메소드 선언부를 그대로 사용하면서
         * 자식인 클래스가 정의한 메소드대로 동작할 수 있도록
         * 구현 몸체를 새롭게 작성하는 것을 할한다.
         */

        Car car = new Car();
        car.isRunning();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();
        System.out.println("==================== 구분선 ====================");

        FireCar fireCar = new FireCar();
        fireCar.run();
        System.out.println("==================== 구분선 ====================");
        fireCar.papa();
        System.out.println("==================== 구분선 ====================");
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.sprayWater();
        fireCar.stop();
        fireCar.soundHorn();
        System.out.println("=================== 구분선 ====================");
    }
}
