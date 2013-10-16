package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class TargetAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
//        ITargetService target = (ITargetService) jp.getTarget();
//        target.process("target");
//        ITargetService proxy = (ITargetService) jp.getThis();
//        proxy.process("proxy");
    }

    public void beforeProcess(JoinPoint jp, String name) {
        System.out.println(this.getClass().getSimpleName() + ".beforeProcess(" + name + ")=======================================");
    }
}
