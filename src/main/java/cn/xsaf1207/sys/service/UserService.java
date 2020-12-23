package cn.xsaf1207.sys.service;

import cn.xsaf1207.sys.domain.User;
import cn.xsaf1207.sys.vo.UserVo;

import java.util.List;

public interface UserService {
    List<User> queryAllUser();
    int updateUser();
    int resetPas(UserVo userVo);
    int deleteUser();
}
