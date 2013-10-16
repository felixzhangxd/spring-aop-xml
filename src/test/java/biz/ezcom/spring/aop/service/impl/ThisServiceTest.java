package biz.ezcom.spring.aop.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.ezcom.spring.aop.service.api.IThisService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext-this.xml")
public class ThisServiceTest {
    @Resource
    private IThisService thisService;

    @Test
    public void testExecute() {
        thisService.execute();
    }
}
