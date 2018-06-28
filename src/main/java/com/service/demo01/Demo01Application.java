package com.service.demo01;

import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;

public class Demo01Application {
    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init();
    }
}
