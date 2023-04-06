package kr.hs.study.config;

import kr.hs.study.beans.DataBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ 붙은 애들은 객체 만들어!!!!
@ComponentScan(basePackages = "kr.hs.study.beans")

public class BeanConfig {
    @Bean
    public DataBean2 java1(){
        return new DataBean2();
    }

    @Bean
    public DataBean2 java2(){
        return new DataBean2();
    }
}

