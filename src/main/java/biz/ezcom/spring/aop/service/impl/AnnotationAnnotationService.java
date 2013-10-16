package biz.ezcom.spring.aop.service.impl;

import org.springframework.stereotype.Service;

import biz.ezcom.spring.aop.annotation.MethodExecuteAnnotation;
import biz.ezcom.spring.aop.annotation.MethodProcessAnnotation;
import biz.ezcom.spring.aop.service.api.IAnnotationAnnotationService;

@Service
public class AnnotationAnnotationService implements IAnnotationAnnotationService {
    @Override
    @MethodExecuteAnnotation
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ".execute()");
    }

    @Override
    @MethodProcessAnnotation
    public void process(String name) {
        System.out.println(this.getClass().getSimpleName() + ".process(" + name + ")");
    }
}
