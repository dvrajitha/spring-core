package nl.springcore.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanThree {
    private BeanOne beanOne;
    private BeanTwo beanTwo;

    @Autowired
    public void setBeanOne(BeanOne beanOne) {
        System.out.println(String.format("inside %s, setBeanOne",getClass().getSimpleName()));
        this.beanOne = beanOne;
    }

    @Autowired
    public void setBeanTwo(BeanTwo beanTwo) {
        System.out.println(String.format("inside %s, setBeanTwo",getClass().getSimpleName()));
        this.beanTwo = beanTwo;
    }

    public BeanThree() {
        System.out.println(String.format("%s init..",getClass().getSimpleName()));
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
