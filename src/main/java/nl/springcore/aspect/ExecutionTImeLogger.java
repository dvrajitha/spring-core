package nl.springcore.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTImeLogger {
    private static  final Logger LOGGER = LoggerFactory.getLogger(ExecutionTImeLogger.class);

    @Before("getAllUsers()")
    void logBefore() {
        LOGGER.info("executing before getAllUsers...........");
    }

    @Pointcut("execution(public * nl.springcore.service.UserService.getAllUsers())")
    void getAllUsers() {
    }
}
