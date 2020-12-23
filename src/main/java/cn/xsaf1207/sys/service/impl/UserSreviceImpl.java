package cn.xsaf1207.sys.service.impl;

import cn.xsaf1207.sys.domain.User;
import cn.xsaf1207.sys.mapper.UserMapper;
import cn.xsaf1207.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserSreviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryAllUser() {
        return null;
    }

    @Override
    public int updateUser() {
        return 0;
    }

    @Override
    public int resetPas() {
        return 0;
    }

    @Override
    public int deleteUser() {
        return 0;
    }
}
