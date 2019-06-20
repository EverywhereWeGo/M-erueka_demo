package f.u.ckdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CkdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CkdemoApplication.class, args);
    }

}
