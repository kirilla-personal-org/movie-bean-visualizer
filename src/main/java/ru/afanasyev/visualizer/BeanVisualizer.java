package ru.afanasyev.visualizer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
public class BeanVisualizer {
    private final ApplicationContext context;

    public List<String> getBeans() {
        return List.of(context.getBeanDefinitionNames());
    }

    @PostConstruct
    public void logBeans() {
        for (String bean : getBeans()) {
            log.debug(bean);
        }
    }
}
