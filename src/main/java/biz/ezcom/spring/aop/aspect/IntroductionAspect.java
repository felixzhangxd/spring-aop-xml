package biz.ezcom.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import biz.ezcom.spring.aop.bean.User;
import biz.ezcom.spring.aop.validater.IIntroductionValidater;

@Component
public class IntroductionAspect {
    public void aroundSave(ProceedingJoinPoint pjp, User user) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + ".aroundSave.before(" + user + ")=======================================");
        IIntroductionValidater validater = (IIntroductionValidater) pjp.getThis();
        if (validater.validate(user)) {
            pjp.proceed();
        }
        System.out.println(this.getClass().getSimpleName() + ".aroundSave.after(" + user + ")=======================================");
    }
}
