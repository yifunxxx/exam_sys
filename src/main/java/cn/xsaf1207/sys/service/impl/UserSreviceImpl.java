package cn.xsaf1207.sys.service.impl;

import cn.xsaf1207.sys.domain.User;
import cn.xsaf1207.sys.mapper.UserMapper;
import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public int resetPas(UserVo userVo) {
        String u_id = userVo.getuId();
        User user = userMapper.selectByPrimaryKey(u_id);
        user.setuPwd(u_id);
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteUser(UserVo userVo) {
        String u_id = userVo.getuId();
        User user = userMapper.selectByPrimaryKey(u_id);
        user.setuId(u_id);
        userMapper.deleteuserScore(user.getuId());
        userMapper.deleteuserRole(user.getuId());
        return userMapper.deleteByPrimaryKey(user.getuId());
    }
}
