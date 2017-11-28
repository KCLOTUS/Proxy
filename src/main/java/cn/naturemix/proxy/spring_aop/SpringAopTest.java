package cn.naturemix.proxy.spring_aop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author flytoyou
 */
public class SpringAopTest {

    public static void main(String [] args){
        ProxyFactory proxyFactory = new ProxyFactory(); // 创建代理工厂
        proxyFactory.setTarget(new GreetingImpl());  //射入目标类对象
        //proxyFactory.addAdvice(new GreetingBeforeAdvice());  //添加前置增强
        //proxyFactory.addAdvice(new GreetingAfterAdvice());  //添加后置增强
        //proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());//前后合一增强
        proxyFactory.addAdvice(new GreetingAroundAdvice());//环绕增强

        Greeting greeting = (Greeting) proxyFactory.getProxy();  //从代理工厂中获取代理

        greeting.say("Jack"); //调用代理的方法

    }
}
