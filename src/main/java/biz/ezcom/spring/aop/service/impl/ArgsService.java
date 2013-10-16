package biz.ezcom.spring.aop.service.impl;

import org.springframework.stereotype.Service;

import biz.ezcom.spring.aop.service.api.IArgsService;

@Service
public class ArgsService implements IArgsService {
    @Override
    public void execute(String name) {
        System.out.println(this.getClass().getSimpleName() + ".execute(" + name + ")");
    }

    @Override
    public void process(String name) {
        System.out.println(this.getClass().getSimpleName() + ".process(" + name + ")");
    }
}
