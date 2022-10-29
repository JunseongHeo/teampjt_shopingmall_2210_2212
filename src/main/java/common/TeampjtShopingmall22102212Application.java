package common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// TODO : DB DataSource를 application.properties에 정의하지 않아 실행오류 발생.
// 		  일단 어노테이션 파라미터에 WAS구동시 DataSource 불러오지 않도록 제외처리
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TeampjtShopingmall22102212Application {

	public static void main(String[] args) {
		SpringApplication.run(TeampjtShopingmall22102212Application.class, args);
	}

}
