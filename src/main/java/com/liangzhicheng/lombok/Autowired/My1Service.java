package com.liangzhicheng.lombok.Autowired;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 第一种
 * 使用@RequiredArgsConstructor(onConstructor = @__(@Autowired))
 * lombok生成My2Service代码
 */
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class My1Service {

    private final TestService testService;

}