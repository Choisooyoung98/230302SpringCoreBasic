package hello.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
        connect();
        call("초기화 연결 메세지");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작시 호출
    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + "message = " + message);
    }

    //서비스 종료시 호출
    public void disconnect() {
        System.out.println("close: " + url);
    }

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메세지");
    }

    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }

    /*
    @PostConstruct, @PreDestroy 어노테이션을 사용하자
    최신 스프링에서 가장 권장하는 방법.
    외부 라이브러리에는 적용하지 못하는 것이 단점 Bean으로 등록해서 사용해야됨.
    코드를 고칠 수 없는 라이브러리를 초기화, 종료해야 하면 Bean의 initMethod, destroyMethod를 사용하자.
    * */
}
