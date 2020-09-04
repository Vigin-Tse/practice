package com.vg.basic.proxy.jdk.demo;

/**
 * @Description
 * @Author xieweij
 * @create 2020/5/8 14:51
 */
public class CarTestStarter {

    /**
     * 动态代理总结：
     * 　　代理对象不需要实现接口,但是目标（委托）对象一定要实现接口,否则不能用动态代理。
     * @param args
     */
    public static void main(String[] args){

        //目标（委托）对象
        Bus target = new Bus();

        //动态生成代理对象
        Car proxy = (Car) new CarProxyFactory(target).getProxyInstance();
        proxy.run();
    }
}
