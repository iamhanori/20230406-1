package kr.hs.study.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
// type으로 객체 만듦
public class TestBean1 {
    // 스프링이 넣어주는 거임
    @Value("22")
    private int data1;
    @Value("22.22")
    private double data2;

    public TestBean1(@Value("33") int data1, @Value("33.33") double data2) {
        this.data1 = data1;
        this.data2 = data2;
    }


}
