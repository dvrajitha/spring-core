package nl.springcore.container;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(String.format("MyBeanPostProcessor.postProcessBeforeInitialization %s %s",  bean.getClass().getSimpleName(), beanName));
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(String.format("MyBeanPostProcessor.postProcessAfterInitialization %s %s",  bean.getClass().getSimpleName(), beanName));
        return bean;
    }
}
