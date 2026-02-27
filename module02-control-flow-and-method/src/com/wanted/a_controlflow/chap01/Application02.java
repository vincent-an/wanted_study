package com.wanted.a_controlflow.chap01;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;
        double discountRate;
        int amount;
        System.out.print("나이를 입력해주세요 : ");
        age = sc.nextInt();
        sc.nextLine();
//        System.out.print("금액을 입력해주세요 : ");
//        amount = sc.nextInt();
//        sc.nextLine();

        if (age < 13) {
            discountRate = 0.5; // 청소년 할인 50%
        } else if (age >= 65) {
            discountRate = 0.3; // 노약자 할인 30%
        } else {
            discountRate = 0.0; // 할인 없음
        }

        System.out.println("나이는 " + age + ", 할인율 : " + (int)(discountRate * 100) + "% 입니다.");
    }
}
