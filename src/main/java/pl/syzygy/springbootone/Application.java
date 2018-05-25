package pl.syzygy.springbootone;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"pl.syzygy.springbootone"})
@EntityScan(basePackages = {"pl.syzygy.springbootone.model"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
