package biz.ezcom.spring.aop.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.ezcom.spring.aop.service.api.IAnnotationTargetService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext-annotation-target.xml")
public class AnnotationTargetServiceTest {
    @Resource
    private IAnnotationTargetService annotationTargetService;

    @Test
    public void testExecute() {
        annotationTargetService.execute();
    }
    
    @Test
    public void testProcess() {
        annotationTargetService.process("Felix");
    }
}
