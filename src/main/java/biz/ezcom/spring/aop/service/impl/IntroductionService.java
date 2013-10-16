package biz.ezcom.spring.aop.service.impl;

import org.springframework.stereotype.Service;

import biz.ezcom.spring.aop.bean.User;
import biz.ezcom.spring.aop.service.api.IIntroductionService;

@Service
public class IntroductionService implements IIntroductionService {
    @Override
    public void save(User user) {
        System.out.println(this.getClass().getSimpleName() + ".save(" + user + ")");
    }
}
