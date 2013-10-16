package biz.ezcom.spring.aop.service.impl;

import org.springframework.stereotype.Service;

import biz.ezcom.spring.aop.service.api.IWithinService;

@Service
public class WithinService implements IWithinService {
    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ".execute()");
    }

    @Override
    public void process(String name) {
        System.out.println(this.getClass().getSimpleName() + ".process(" + name + ")");
    }
}
