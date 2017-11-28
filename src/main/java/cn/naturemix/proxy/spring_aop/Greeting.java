package cn.naturemix.proxy.spring_aop;

import cn.naturemix.framework.annotation.Component;

/**
 * @author flytoyou
 */
@Component
public interface Greeting {
    void say(String name);
}
