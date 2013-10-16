package biz.ezcom.spring.aop.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.ezcom.spring.aop.bean.User;
import biz.ezcom.spring.aop.service.api.IAnnotationArgsService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext-annotation-args.xml")
public class AnnotationArgsServiceTest {
    @Resource
    private IAnnotationArgsService annotationArgsService;

    @Test
    public void testExecute() {
        annotationArgsService.execute(new User(1, "Felix", "pwd"));
    }
}
