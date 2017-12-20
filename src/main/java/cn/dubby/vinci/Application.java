package cn.dubby.vinci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by teeyoung on 17/12/5.
 */
@SpringBootApplication
@EnableScheduling
@ServletComponentScan({"cn.dubby.vinci.filter"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
