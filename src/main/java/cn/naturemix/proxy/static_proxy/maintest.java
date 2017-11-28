package cn.naturemix.proxy.static_proxy;



public class maintest {
    public static void main(String [] args){
         //Greeting hello =new GreetingImpl();
        //helloProxy.say("Jack");
        /*
        DynamicProxy dynamicProxy = new DynamicProxy(new GreetingImpl());

        Greeting helloProxy = dynamicProxy.getProxy();
        helloProxy.say("Jack");
        */
        Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        helloProxy.say("Jack");

    }
}
