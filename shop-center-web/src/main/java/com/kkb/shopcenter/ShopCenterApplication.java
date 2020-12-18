package com.kkb.shopcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ShopCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopCenterApplication.class, args);
	}

}
