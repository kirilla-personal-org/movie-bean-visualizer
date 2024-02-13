package testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.afanasyev.visualizer.EnableBeanVisualization;

@SpringBootApplication(scanBasePackages = {"testapp"})
@EnableBeanVisualization
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
