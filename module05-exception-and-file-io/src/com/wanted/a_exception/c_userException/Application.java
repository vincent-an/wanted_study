package com.wanted.a_exception.c_userException;

import com.wanted.a_exception.c_userException.exception.MoneyNegativeException;
import com.wanted.a_exception.c_userException.exception.NotEnoughMoneyException;
import com.wanted.a_exception.c_userException.exception.PriceNegativeException;

public class Application {
    public static void main(String[] args) {

        /**
         * comment, 사용자 정의의 예외클래스 정의하기
         * 사전에 정의되어 있는 Exception의 종류는 굉장히 많다.
         * 하지만 현실세계에서 발생할 수 있는 수많은 예외들을 처리하기엔 너무 추상적이다.
         * 따라서 우리는 extends Exception을 통해 우리 프로젝트만의
         * 커스텀 Exception 클래스를 정의할 것이다.
         */

        ExceptionTest et = new ExceptionTest();

        // 상품 가격보다 가진 돈이 적은 경우
        try {
            et.checkEnoughMoney(-50000, 30000);
        } catch (PriceNegativeException e) {
            System.out.println("e.getClass : " + e.getClass());
        } catch (MoneyNegativeException e) {
            System.out.println("돈 음수 시 발생");
        } catch (NotEnoughMoneyException e) {
            System.out.println("돈 충분 하지 않음");
        }
    }
}
