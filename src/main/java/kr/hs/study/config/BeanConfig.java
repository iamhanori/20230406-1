package kr.hs.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ 붙은 애들은 객체 만들어!!!!
@ComponentScan(basePackages = "kr.hs.study.beans")

public class BeanConfig {

}

