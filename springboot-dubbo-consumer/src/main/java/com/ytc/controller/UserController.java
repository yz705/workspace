package com.ytc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ytc.model.User;
import com.ytc.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yaozheng
 * @create 2020/9/25
 * @since 1.0.0
 */
@RestController
public class UserController {
    @Reference
    private UserService userService;

    public List<User> queryUserList(){
        System.out.println("123");
        System.out.println("456");
        List<User> users = userService.queryUserList();
        return users;
    }
}