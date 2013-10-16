package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AnnotationTargetAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
//        IAnnotationTargetService target = (IAnnotationTargetService) jp.getTarget();
//        target.process("target");
//        IAnnotationTargetService proxy = (IAnnotationTargetService) jp.getThis();
//        proxy.process("proxy");
    }

    public void beforeProcess(JoinPoint jp, String name) {
        System.out.println(this.getClass().getSimpleName() + ".beforeProcess(" + name + ")=======================================");
    }
}
