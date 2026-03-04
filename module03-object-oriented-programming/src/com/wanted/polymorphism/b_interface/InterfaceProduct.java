package com.wanted.polymorphism.b_interface;

public interface InterfaceProduct {

    /**
     * comment. 인터페이스
     *  인터페이스는 구현부가 있는 메서드를 작성할 수 없다. 또한, 생성자 역시 가질 수 없다.
     */
    // 인터페이스는 구현부가 있는 메서드를 못 쓴다.
//    public void test() {}

    // 인터페이스는 생성자를 사용하지 못한다.
//    public InterfaceProduct() {}

    void methodA();

    static void staticMathod() {
        // static 메서드는 구현부 작성이 가능하다. why? static은 클래스를 통해 호출하기 때문에.
        System.out.println("staticMethod 호출됨...");
    }
}
