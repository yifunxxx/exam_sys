package cn.xsaf1207.sys.service.impl;

import cn.xsaf1207.sys.domain.User;
import cn.xsaf1207.sys.mapper.UserMapper;
import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

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
        User user = new User();
        String pwd = DigestUtils.md5DigestAsHex(u_id.getBytes());
        user.setuPwd(pwd);
        return userMapper.updateByPrimaryKeySelective(user);

    }

    @Override
    public int deleteUser() {
        return 0;
    }
}
