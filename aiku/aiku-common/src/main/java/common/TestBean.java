package common;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
    public void loadBean(){
        System.out.println("aiku-common모듈의 TestBean을 성공적으로 로딩했습니다.");
    }
}
