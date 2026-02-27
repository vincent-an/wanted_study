package com.wanted.object.b_array;

public class Application03 {

    public static void main(String[] args) {

        // 출력 예시 : 당신이 뽑은 카드는 SPADE 10 입니다!
        // 필요한 값 : 카드 넘버, 문양

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "JACK", "QUEEN", "KING", "ACE"};

        // Math 클래스 -> 수학적 요소(합계, 평균, 올림, 내림, 등등)
        // 수포자를 위해 개발자들이 미리 만들어둠,
        int randomShape = (int) (Math.random() * shapes.length);
        System.out.println("randomShape = " + randomShape);

        int randomNumber = (int) (Math.random() * number.length);
        System.out.println("randomNumber = " + randomNumber);

        System.out.println("당신이 뽑은 카드는 " + shapes[randomShape] + ", "
        + number[randomNumber] + "입니다!!");
    }
}
