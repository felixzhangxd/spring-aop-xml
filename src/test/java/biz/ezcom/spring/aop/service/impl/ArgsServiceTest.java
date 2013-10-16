package biz.ezcom.spring.aop.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.ezcom.spring.aop.service.api.IArgsService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext-args.xml")
public class ArgsServiceTest {
    @Resource
    private IArgsService argsService;
    
    @Test
    public void testExecute() {
        argsService.execute("Felix");
    }
    @Test
    public void testProcess() {
        argsService.process("Felix");
    }
}
