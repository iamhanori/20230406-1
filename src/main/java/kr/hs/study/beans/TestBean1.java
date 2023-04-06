package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// type으로 객체 만듦
public class TestBean1 {
    // 스프링이 넣어주는 거임
    @Value("22")
    private int data1;
    @Value("22.22")
    private double data2;

    public TestBean1() {

    }
    public int getData1() {
        return data1;
    }

    public double getData2() {
        return data2;
    }

}
