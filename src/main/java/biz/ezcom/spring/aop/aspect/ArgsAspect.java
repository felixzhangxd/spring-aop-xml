package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ArgsAspect {
    
    public void beforeExecute(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeExecute()=======================================");
//        IArgsService target = (IArgsService) jp.getTarget();
//        target.process("target");
//        IArgsService proxy = (IArgsService) jp.getThis();
//        proxy.process("proxy");
    }

    public void beforeProcess(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + ".beforeProcess()=======================================");
    }
}
