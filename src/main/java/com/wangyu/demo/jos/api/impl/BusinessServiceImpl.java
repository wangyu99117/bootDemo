package com.wangyu.demo.jos.api.impl;

import com.wangyu.demo.jos.api.BusinessService;

/**
 * Created by wangyu21 on 2018/3/28.
 */
public class BusinessServiceImpl implements BusinessService{


    @Override
    public int count() {
        return 0;
    }

    @Override
    public int count(int page) {
        return 1;
    }

    @Override
    public int count(int page, int num) {
        return 2;
    }
}
