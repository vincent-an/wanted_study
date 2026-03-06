package com.wanted.a_exception.c_userException;

import com.wanted.a_exception.c_userException.exception.MoneyNegativeException;
import com.wanted.a_exception.c_userException.exception.NotEnoughMoneyException;
import com.wanted.a_exception.c_userException.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        // 상품 가격 음수일 때
        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }

        // 가진 돈 음수일 때
        if (money < 0) {
            throw new MoneyNegativeException("가진 돈은 음수일 수 없습니다.");

        }

        // 상품가격이 가진 돈 보다 클 때
        if (price > money) {
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 비쌉니다.");
        }

        // 통과 구문
        System.out.println("가진 돈이 충분합니다.");
    }
}
