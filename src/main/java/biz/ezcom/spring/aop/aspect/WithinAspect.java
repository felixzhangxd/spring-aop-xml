package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import biz.ezcom.spring.aop.service.api.IWithinService;

@Component
public class WithinAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
        IWithinService target = (IWithinService) jp.getTarget();
        target.process("target");
        IWithinService proxy = (IWithinService) jp.getThis();
        proxy.process("proxy");
    }
}
