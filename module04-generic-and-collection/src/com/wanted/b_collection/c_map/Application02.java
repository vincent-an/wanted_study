package com.wanted.b_collection.c_map;

import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {
        /**
         * comment, Properties 라는 것에 대해 알 수 있다.
         * properties는 지금 당장 사용하지는 않지만,
         * 향후 Spring 모듈에서 계속 등장한다.
         * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용된다. (ex -> .env, .properties, .yaml )
         */

        Properties prop = new Properties();
        prop.setProperty("driver", "cj.jdbc.driver.mysql");
        prop.setProperty("url", "jdbc:mysql:vincentDB:@127.0.0.1:3306:xe");
        prop.setProperty("user", "vincent-an");
        prop.setProperty("password", "wanted1234");

        System.out.println("prop = " + prop);
    }
}
