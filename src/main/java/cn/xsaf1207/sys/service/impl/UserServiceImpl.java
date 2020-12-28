package cn.xsaf1207.sys.service.impl;

import cn.xsaf1207.exam.mapper.ErrorQuestionMapper;
import cn.xsaf1207.sys.domain.Role;
import cn.xsaf1207.sys.domain.User;
import cn.xsaf1207.sys.mapper.EsClassMapper;
import cn.xsaf1207.sys.mapper.RoleMapper;
import cn.xsaf1207.sys.mapper.UserMapper;
import cn.xsaf1207.sys.service.UserService;
import cn.xsaf1207.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private EsClassMapper esClassMapper;
    @Autowired
    private ErrorQuestionMapper errorQuestionMapper;
    @Autowired
    private RoleMapper roleMapper;

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

            Integer rId = roleMapper.selectRidByUid(user.getuId());
            if(rId != null){
                Role role = roleMapper.selectByPrimaryKey(rId);
                userVo.setuType(role.getrName());
            }
            userVos.add(userVo);
        }
        return userVos;
    }

    @Override
    public int updateUser(UserVo userVo) {
        return userMapper.updateByPrimaryKeySelective(userVo);
    }

    @Override
    public int resetPas(UserVo userVo) {
        userVo.setuPwd(DigestUtils.md5DigestAsHex(userVo.getuId().getBytes()));
        return userMapper.updateByPrimaryKeySelective(userVo);
    }

    @Override
    public int deleteUser(UserVo userVo) {
        String u_id = userVo.getuId();
        User user = userMapper.selectByPrimaryKey(u_id);
        user.setuId(u_id);
        userMapper.deleteuserScore(user.getuId());
        errorQuestionMapper.deleteByUid(u_id);
        userMapper.deleteuserRole(user.getuId());
        return userMapper.deleteByPrimaryKey(user.getuId());
    }

    @Override
    public int addUser(UserVo userVo) {
        userVo.setuPwd(DigestUtils.md5DigestAsHex(userVo.getuId().getBytes()));
        String csName = userVo.getCsName();
        Integer csId = esClassMapper.selectCsnameByCsid(csName);
        userVo.setCsId(csId);
        return userMapper.insertSelective(userVo);
    }

    @Override
    public int distrole(UserVo userVo) {
        userMapper.deleteuserRole(userVo.getuId());
        return userMapper.insertUidRid(userVo);
    }
}
