package biz.ezcom.spring.aop.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.ezcom.spring.aop.service.api.IBeanService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext-bean.xml")
public class BeanServiceTest {
    @Resource
    private IBeanService beanService;
    
    @Test
    public void testExecute() {
        beanService.execute();
    }
    
    @Test
    public void testProcess() {
        beanService.process("Felix");
    }
}
