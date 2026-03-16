package com.wanted.oop.c_abstraction.dto;

public class Application {
    public static void main(String[] args) {
        /**
         * comment. DTO(Data Transfer Object)
         * 클래스를 설계할 때, 필드와 메서드로 구성을 한다.
         * 추상화를 진행을 할 때, 객체를 설계하고 클래스를 이용해 프로그래밍을 해보았다.
         * 하지만, 추상화는 굉장히 어려운 작업이다.
         * 캡슐화의 원칙에는 일부 어긋나긴 하지만, 매번 추강화를 하지 않아도 되는 객체도 존재한다.
         * 그것이 바로 행위 위주가 아닌, 데이터 위주로 클래스를 설계한 DTO 라는 것이다.
         */

        /**
         * comment, MemberDTO 클래스는 회원이 할 수 있는 행동이 주체가 아닌, 회원의 데이터에 집중해서 작성하는 클래스이다.
         */

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setNo(1);
        memberDTO.setName("안정수");
        memberDTO.setAge(20);
        memberDTO.setGender('M');
        memberDTO.setHeight(176);
        memberDTO.setActivated(true);

        System.out.println(memberDTO.getNo());
        System.out.println("member : " + memberDTO);
    }
}
