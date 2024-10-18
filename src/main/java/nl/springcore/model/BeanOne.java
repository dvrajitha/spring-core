package nl.springcore.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    public BeanOne() {
        System.out.println(String.format("%s init..", getClass().getSimpleName()));
    }

    @PostConstruct
    void  postConstruct() {
        System.out.println(String.format("%s object created",getClass().getSimpleName()));
    }
    @PreDestroy
    void destroy() {
        System.out.println(String.format("%s object destroyed",getClass().getSimpleName()));
    }
}
