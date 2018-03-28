package com.wangyu.demo.jos.api;

import com.wangyu.demo.jos.ApiVersion;

/**
 * Created by wangyu21 on 2018/3/28.
 */
public interface BusinessService {

    @ApiVersion(ver=1)
    int count();

    @ApiVersion(ver=2)
    int count(int page);

    @ApiVersion(ver=3)
    int count(int page, int num);
}
