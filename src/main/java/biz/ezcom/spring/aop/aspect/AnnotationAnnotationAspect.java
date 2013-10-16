package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import biz.ezcom.spring.aop.service.api.IAnnotationAnnotationService;

@Component
public class AnnotationAnnotationAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
        IAnnotationAnnotationService target = (IAnnotationAnnotationService) jp.getTarget();
        target.process("target");
        IAnnotationAnnotationService proxy = (IAnnotationAnnotationService) jp.getThis();
        proxy.process("proxy");
    }

    public void beforeProcess(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeProcess()=======================================");
    }
}
