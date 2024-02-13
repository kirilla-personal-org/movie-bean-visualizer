package ru.afanasyev.visualizer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
@EnableConfigurationProperties(VisualizerProperties.class)
public class VisualizerConfiguration {
    @Bean
    public BeanVisualizer beanVisualizer(ApplicationContext applicationContext) {
        log.info("Bean visualization enabled");
        return new BeanVisualizer(applicationContext);
    }
}
