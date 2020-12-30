package cn.xsaf1207.sys.service;

import cn.xsaf1207.sys.vo.UserVo;

import java.util.List;

public interface UserService {

    List<UserVo> queryAllUser();

    int updateUser(UserVo userVo);

    int resetPas(UserVo userVo);

    int deleteUser(UserVo userVo);

    int addUser(UserVo userVo);

    int distrole(UserVo userVo);

    List<UserVo> getuser(UserVo userVo);

    UserVo login(UserVo userVo);

    int updatePwd(UserVo userVo);
}
