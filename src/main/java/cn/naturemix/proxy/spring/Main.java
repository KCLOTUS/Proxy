package cn.naturemix.proxy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String [] args){

        //不使用框架
        /*
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("Spring");
        helloWorld.sayHello();*/

        //使用框架
        //创建一个Spring的IOC容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //从IOC容器中获取bean实例
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
        //调用方法
        helloWorld.sayHello();

    }

}
