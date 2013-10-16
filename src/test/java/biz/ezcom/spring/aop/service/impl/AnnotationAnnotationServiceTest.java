package biz.ezcom.spring.aop.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.ezcom.spring.aop.service.api.IAnnotationAnnotationService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext-annotation-annotation.xml")
public class AnnotationAnnotationServiceTest {
    @Resource
    private IAnnotationAnnotationService annotationAnnotationService;

    @Test
    public void testExecute() {
        annotationAnnotationService.execute();
    }
}
