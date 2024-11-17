package nl.springcore.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultService {
    public void sayHello() {
        System.out.println(this);
        System.out.println("Hello from default" + this.hashCode());
    }
}
