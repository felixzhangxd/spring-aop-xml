package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import biz.ezcom.spring.aop.service.api.IThisService;

@Component
public class ThisAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
        IThisService target = (IThisService) jp.getTarget();
        target.process("target");
        IThisService proxy = (IThisService) jp.getThis();
        proxy.process("proxy");
    }

    public void beforeProcess(JoinPoint jp, String name) {
        System.out.println(this.getClass().getSimpleName() + ".beforeProcess(" + name + ")=======================================");
    }
}
