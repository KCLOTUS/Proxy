package cn.naturemix.proxy.spring_aop;

import cn.naturemix.framework.annotation.Component;

/**
 * @author flytoyou
 */
@Component
public class GreetingImpl implements Greeting {

    public void say(String name) {
        System.out.println("Greeting! " + name);
    }
}
