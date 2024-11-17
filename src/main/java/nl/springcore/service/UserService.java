package nl.springcore.service;

import nl.springcore.model.api.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private List<User> users = List.of(new User("Tom", 35), new User("John", 25));
    public List<User> getAllUsers() {
        return users;
    }

    public String anotherMethod(String param) {
        System.out.println("anotherMethod....");
        return "";
    }
}
