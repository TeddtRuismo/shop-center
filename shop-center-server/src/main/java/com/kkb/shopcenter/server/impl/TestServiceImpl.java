package com.kkb.shopcenter.server.impl;

import com.kkb.shopcenter.api.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getMessage() {
        return "hello ni hao";
    }
}
