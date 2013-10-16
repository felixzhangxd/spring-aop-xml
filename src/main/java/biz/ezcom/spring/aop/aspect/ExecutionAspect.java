package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import biz.ezcom.spring.aop.service.api.IExecutionService;

@Component
public class ExecutionAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
        IExecutionService target = (IExecutionService) jp.getTarget();
        target.process("target");
        IExecutionService proxy = (IExecutionService) jp.getThis();
        proxy.process("proxy");
    }

    public void beforeProcess(JoinPoint jp, String name) {
        System.out.println(this.getClass().getSimpleName() + ".beforeProcess(" + name + ")=======================================");
    }
}
