package org.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.myweb.entity.User;
import com.myweb.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  //��ʾ�̳���SpringJUnit4ClassRunner��
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})

public class TestMybatis {
	private static Logger logger=Logger.getLogger(TestMybatis.class);
	
	@Resource
	private UserService userService=null;
	
	@Test
	public void test1(){
		User user=userService.getUserById(1);
		logger.info(JSON.toJSONString(user));
	}
}
