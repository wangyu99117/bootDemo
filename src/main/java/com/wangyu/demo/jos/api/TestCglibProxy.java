package com.wangyu.demo.jos.api;

import com.wangyu.demo.jos.api.impl.BusinessServiceImpl;
import com.wangyu.demo.jos.proxy.CommonMethodInterceptor;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by wangyu21 on 2018/3/28.
 */
public class TestCglibProxy {

    public static void main(String[] args){
        Enhancer  enhancer = new Enhancer();
        enhancer.setSuperclass(BusinessServiceImpl.class);
        enhancer.setCallback(new CommonMethodInterceptor());
        BusinessServiceImpl service = (BusinessServiceImpl)enhancer.create();
        int num = service.count();
        System.out.println(num + "-----");
    }
}
