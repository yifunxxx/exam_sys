package cn.xsaf1207.sys.service.impl;

import cn.xsaf1207.sys.domain.EsClass;
import cn.xsaf1207.sys.domain.User;
import cn.xsaf1207.sys.mapper.EsClassMapper;
import cn.xsaf1207.sys.mapper.UserMapper;
import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSreviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private EsClassMapper esClassMapper;

    public List<UserVo> queryAllUser() {
        List<User> users = userMapper.selectAllUser();
        List<UserVo> userVos = new ArrayList<>();
        for(User user : users){
            UserVo userVo = new UserVo();

            userVo.setuId(user.getuId());
            userVo.setuName(user.getuName());
            userVo.setuSex(user.getuSex());
            userVo.setuPwd(user.getuPwd());
            userVo.setuPhone(user.getuPhone());
            userVo.setuCreatime(user.getuCreatime());
            userVo.setCsId(user.getCsId());
            userVo.setuAvaiable(user.getuAvaiable());

            userVo.setCsName(esClassMapper.selectByPrimaryKey(userVo.getCsId()).getCsName());
            userVos.add(userVo);
        }
        return userVos;
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
