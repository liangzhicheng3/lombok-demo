package com.liangzhicheng.lombok.with;

import lombok.AllArgsConstructor;
import lombok.With;

@AllArgsConstructor
@With //允许创建一个新的对象，该对象是当前对象的副本，但某些字段的值已被更改
public class User {

    private String name;

    private Integer age;

    public User(){
        User user = new User("lzc", 18);
        //创建一个新的User对象，其中name为"lzc"，但age为19
        User updateUser = user.withAge(19);
    }

}