package cn.naturemix.proxy.spring_proxy_bean.service;

import cn.naturemix.proxy.spring_proxy_bean.model.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

    @Test
    public void testAdd() throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        UserService service = (UserService)ctx.getBean("userService");
        System.out.println(service.getClass());
        service.add(new User());
        System.out.println("###");

        ctx.destroy();

    }

}
