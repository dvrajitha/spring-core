package nl.springcore.service;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Service
public class RequestScopeBean {
    public void sayHello() {
        System.out.println(this);
        System.out.println("Hello from RequestScopeBean" + this.hashCode());
    }
}
