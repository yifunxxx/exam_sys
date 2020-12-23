package cn.xsaf1207.sys.service;

import cn.xsaf1207.sys.domain.User;

import java.util.List;

public interface UserService {
    List<User> queryAllUser();
    int updateUser();
    int resetPas();
    int deleteUser();
}
