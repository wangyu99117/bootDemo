package com.wangyu.demo.jos.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wangyu21 on 2018/3/28.
 */
public class CommonMethodInterceptor implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("run before" + method.getName());
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("run after" + method.getName());
        return object;
    }
}
