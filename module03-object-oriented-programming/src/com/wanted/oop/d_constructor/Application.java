package com.wanted.oop.d_constructor;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        /**
         * comment, 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다.
         *  생성자란?
         * 우리가 지금까지 클래스명 변수명 = new 클래스명(); 이런 식으로 객체를 만들어왔다.
         * new 뒤에 클래스명은 사실 생성자라고 불리는 메서드를 호출하는 구문이다.
         * 하지만, 우리는 지금까지 저런 메서드를 만든적이 없다.
         * compiler 가 매개변수가 없는 생성자를 자동으로 추가해준다.
         */

        UserDTO userDTO = new UserDTO();
        System.out.println("User의 초기값 : " + userDTO);

        UserDTO userDTO2 = new UserDTO("user01", "1234", "안정수", LocalDateTime.now());
        System.out.println("usre2의 초기값 : " + userDTO2);
    }
}
