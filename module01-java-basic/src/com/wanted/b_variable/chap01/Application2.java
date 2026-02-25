package com.wanted.b_variable.chap01;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        // Scanner 클래스는 사용자의 입력을 저장할 수 있다.
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();

        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        System.out.print("취미를 입력해주세요 : ");
        String fav = sc.nextLine();

        System.out.println("당신의 이름은 " + name + "입니다.");
    }
}
