package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.UserMapper;
import com.ytc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yaozheng
 * @create 2020/9/25
 * @since 1.0.0
 */
@Service
@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}