package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import biz.ezcom.spring.aop.bean.Manager;
import biz.ezcom.spring.aop.service.api.IAnnotationArgsService;

@Component
public class AnnotationArgsAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
        IAnnotationArgsService target = (IAnnotationArgsService) jp.getTarget();
        target.process(new Manager(1, "Felix", "target"));
        IAnnotationArgsService proxy = (IAnnotationArgsService) jp.getThis();
        proxy.process(new Manager(1, "Felix", "proxy"));
    }

    public void beforeProcess(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeProcess()=======================================");
    }
}
