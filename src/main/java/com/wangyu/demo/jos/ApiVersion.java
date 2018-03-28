package com.wangyu.demo.jos;

import java.lang.annotation.*;

/**
 * Created by wangyu21 on 2018/3/28.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ApiVersion {
    int ver();
}
