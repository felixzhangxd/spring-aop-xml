package biz.ezcom.spring.aop.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.ezcom.spring.aop.service.api.IAnnotationWithinService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext-annotation-within.xml")
public class AnnotationWithinServiceTest {
    @Resource
    private IAnnotationWithinService annotationWithinService;

    @Test
    public void testExecute() {
        annotationWithinService.execute();
    }
    
    @Test
    public void testProcess() {
        annotationWithinService.process("Felix");
    }
}
