package ru.afanasyev.visualizer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("${bean.visualizer.web-path}")
@RequiredArgsConstructor
public class MvcBeanController {
    private final BeanVisualizer beanVisualizer;

    @GetMapping
    public String getBeans(Model model) {
        List<String> beans = beanVisualizer.getBeans().stream().sorted().toList();
        model.addAttribute("beans", beans);
        return "beans";
    }
}
