package cn.likaihai.com.app;

import java.util.ArrayList;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("cn.likaihai.com")
@MapperScan("cn.likaihai.com.mapper")
@EnableCaching //开启缓存的注解
//@EnableScheduling //开启定时任务注解
@EnableAsync
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		ArrayList<String> arrayList = new ArrayList<String>();
	}

}
