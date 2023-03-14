package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //@Component 어노테이션이 붙어있으면 자동으로 스프링 빈에 등록해준다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)//예제를 위한 추가 설정

public class AutoAppConfig {


}
