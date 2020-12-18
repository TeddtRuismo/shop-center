package com.kkb.shopcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ShopCenterWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopCenterWebApplication.class, args);
	}

}
