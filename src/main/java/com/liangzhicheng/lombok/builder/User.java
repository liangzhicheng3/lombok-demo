package com.liangzhicheng.lombok.builder;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.Arrays;
import java.util.List;

/**
 * Singular注解和Builder注解组合
 */
@Data
@Builder //链式调用
public class User {

    private String name;

    private Integer age;

    /**
     * 如果没有指定value属性值，集合字段名必须是复数形式
     * 用在集合类型字段上，会生成两个方法，一个是添加单个元素的方法，一个是添加整个集合的方法
     * 灵活地添加集合类型的字段，而不需要自己创建和初始化集合对象
     */
    @Singular
    private List<String> hobbies;


    public User(){
        User user1 = User.builder()
                .name("lzc")
                .age(18)
                .hobby("篮球") //添加单个元素
                .hobby("唱歌") //添加单个元素
                .hobbies(Arrays.asList("打豆豆", "其他")) //添加整个集合
                .build();

        //可以使用clear()方法来清空集合字段
        User user2 = User.builder()
                .name("lzc")
                .age(18)
                .hobby("篮球")
                .hobby("唱歌")
                .clearHobbies()
                .hobby("打豆豆")
                .build();
    }

}