package com.wanted.a_generic.b_use.run;

import com.wanted.a_generic.b_use.*;

public class Application02 {
    public static void main(String[] args) {

        /**
         * comment. 와일드카드
         *  제네릭 클래스 타입의 객체를 메소드의 매개변수로 전달받을 때,
         *  그 객체의 타입변수를 제한 할 수 있다.
         * <?> : 제한 없음
         * <? extends Type> : 와일드카드 상한 제한, 위는 안된다.
         * <? super Type> : 와일드카드 하한 제한, 아래는 안된다.
         */

        WildcardFarm wfarm = new WildcardFarm();

        System.out.println("================ <?> ==================");
        wfarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wfarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        wfarm.anyType(new RabbitFarm<Bunny>(new Bunny()));

        System.out.println("============== <? extends Rabbit> ================");
        wfarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wfarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("============== <? super Rabbit> ================");
        wfarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        wfarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));

        System.out.println("============ [Method-eat] ================");
//        wfarm.eating(new Rabbit());
//        wfarm.eating(new Bunny());
//        wfarm.eating(new DrunkenBunny());
//        wfarm.eating(new Reptile());

        wfarm.eating(new RabbitFarm<>(new Rabbit()));
        wfarm.eating(new RabbitFarm<>(new Bunny()));
        wfarm.eating(new RabbitFarm<>(new DrunkenBunny()));
    }
}
