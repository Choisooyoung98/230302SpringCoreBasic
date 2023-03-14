package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //@Component 어노테이션이 붙어있으면 자동으로 스프링 빈에 등록해준다.
        basePackages = "hello.core", //hello.core 패키지 안에 있는 것만 등록. 지정하지 않으면 @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작 위치가 된다.
        //프로젝트 시작위치에 설정 정보를 두는 것이 좋다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)//예제를 위한 추가 설정

//컴포넌트 스캔 기본 대상
//@Component: 컴포넌트 스캔에서 사용
//@Controller: 스프링 MVC 컨트롤러에서 사용
//@Service: 스프링 비지니스 로직에서 사용
//@Repository: 스프링 데이터 접근 계층에서 사용, 스프링 데이터 접근 계층으로 인식하고, 데이터 계층의 예외를 스프링 예외로 변환해준다.
//@Configuration: 스프링 설정 정보에서 사용, 스플링 빈이 싱글톤을 유지하도록 추가 처리를 한다.
public class AutoAppConfig {

}
