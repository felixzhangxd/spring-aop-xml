package biz.ezcom.spring.aop.service.impl;

import org.springframework.stereotype.Service;

import biz.ezcom.spring.aop.bean.Manager;
import biz.ezcom.spring.aop.bean.User;
import biz.ezcom.spring.aop.service.api.IAnnotationArgsService;

@Service
public class AnnotationArgsService implements IAnnotationArgsService {
    @Override
    public void execute(User user) {
        System.out.println(this.getClass().getSimpleName() + ".execute("+user+")");
    }

    @Override
    public void process(Manager manager) {
        System.out.println(this.getClass().getSimpleName() + ".process(" + manager + ")");
    }
}
