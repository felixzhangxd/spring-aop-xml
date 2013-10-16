package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class BeanAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
    }

    public void beforeProcess(JoinPoint jp, String name) {
        System.out.println(this.getClass().getSimpleName() + ".beforeProcess(" + name + ")=======================================");
    }
}
