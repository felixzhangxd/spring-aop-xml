package biz.ezcom.spring.aop.service.api;

import biz.ezcom.spring.aop.bean.Manager;
import biz.ezcom.spring.aop.bean.User;

public interface IAnnotationArgsService {
    void execute(User user);

    void process(Manager manager);
}
