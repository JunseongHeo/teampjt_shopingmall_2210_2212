package com.teampjt_shopingmall_2210_2212.teampjt_shopingmall_2210_2212;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TeampjtShopingmall22102212Application.class);
	}

}
