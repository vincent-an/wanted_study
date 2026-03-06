package com.wanted.d_fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Applcation02 {
    public static void main(String[] args) {

        /**
         * comment, try()
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("저장할 메시지를 입력해주세요 : ");
        String msg = sc.nextLine();

        /**
         * comment. try() 구문은 기존 try캐치 구문을 발전시킨 구문이며,
         *  finally 블럭에서 사용한 자원을 해제하는 것이 필수였지만,
         *  try() 를 사용하게 되면, 사용한 리소스를 finally 블럭 없이 자동으로 재거해준다.
         */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("uesr.input"))) {
            writer.write("사용자 입력 : " + msg + "\n");
            writer.write("작성 시간 : " + java.time.LocalDateTime.now());
            writer.flush();
            System.out.println("사용자의 입력 데이터 저장 완료!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
