package com.wanted.a_generic.b_use.run;

import com.wanted.a_generic.b_use.*;

public class Application01 {
    public static void main(String[] args) {


//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
        RabbitFarm<Rabbit> farm2 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm3 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm4 = new RabbitFarm<>();

//        Rabbit rabbit = new Rabbit();
//        farm2.setAnimal(rabbit);

        // 위 두 줄과 아래 한 줄은 같은 의미이다.
        farm2.setAnimal(new Rabbit());

        // Rabbit 객체를 불러온다.
        farm2.getAnimal();

        // 불러온 특정 Rabbit의 cry() 메서드를 실행시킨다.
        farm2.getAnimal().cry();

        farm3.setAnimal(new Bunny());
        farm3.getAnimal().cry();

        farm4.setAnimal(new DrunkenBunny());
        farm4.getAnimal().cry();
    }
}
