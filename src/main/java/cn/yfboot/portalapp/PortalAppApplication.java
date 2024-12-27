package cn.yfboot.portalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class PortalAppApplication {

    private final Environment environment;

    public PortalAppApplication(Environment environment) {
        this.environment = environment;
    }

    public static void main(String[] args) {
        SpringApplication.run(PortalAppApplication.class, args);
    }

    @PostConstruct
    public void printServerPort() {
        System.out.println("当前配置的服务器端口号: " + environment.getProperty("server.port"));
    }

}
