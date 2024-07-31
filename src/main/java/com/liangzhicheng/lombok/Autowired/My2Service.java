package com.liangzhicheng.lombok.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class My2Service {

    private final TestService testService;

    @Autowired
    public My2Service(TestService testService) {
        this.testService = testService;
    }

}