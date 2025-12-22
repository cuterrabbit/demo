package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * SpringBootServletInitializer
 * - war 파일을 배포할 경우 해당 클래스를 반드시 상속받아야 한다
 * - 외부 톰캣에서 동작하도록 하기 위해서는 web.xml에 애플리케이션 컨텍스트를 등록해야 한다
 * - 아파치 톰캣이 구동될 때 web.xml을 읽어 웹 애플리케이션을 구동한다
 */

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
	// war 파일로 배포할 경우, SpringBootServletInitializer로 상속 필요, 외부 톰캣으로 실행하기 위해
	public static void main(String[] args) {		// 메인 함수가 있으면 jar로 빌드 가능
		SpringApplication.run(DemoApplication.class, args);
	}
	
	// 외부 톰캣을 사용할 때, Spring Boot 의 시작지점을 지정하는 메소드를 만들어야함
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}
	
}
