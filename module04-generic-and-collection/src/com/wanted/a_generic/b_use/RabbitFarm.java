package com.wanted.a_generic.b_use;


/**
 * comment. T <- 타입변수에는 어떤 값이 들어올 지 모른다.
 *  단, extends Rabbit 이라고 작성하게 되면
 *  T 타입변수에는 Rabbit 혹은 Rabbit을 상속받은 클래스만 들어올 수 있게된다.
 * @param <T>
 */
public class RabbitFarm<T extends Rabbit> {

    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
