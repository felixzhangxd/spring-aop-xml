package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AnnotationWithinAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
//        IAnnotationWithinService target = (IAnnotationWithinService) jp.getTarget();
//        target.process("target");
//        IAnnotationWithinService proxy = (IAnnotationWithinService) jp.getThis();
//        proxy.process("proxy");
    }

    public void beforeProcess(JoinPoint jp, String name) {
        System.out.println(this.getClass().getSimpleName() + ".beforeProcess(" + name + ")=======================================");
    }
}
