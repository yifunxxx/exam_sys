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

    @Override
    public List<UserVo> getuser(UserVo userVo) {
        List<User> users = userMapper.selectUser(userVo);
        List<UserVo> userVos = new ArrayList<>();
        if(userVo.getuType() == ""){
            for(User user : users){
                UserVo userVo1 = new UserVo();

                userVo1.setuId(user.getuId());
                userVo1.setuName(user.getuName());
                userVo1.setuSex(user.getuSex());
                userVo1.setuPwd(user.getuPwd());
                userVo1.setuPhone(user.getuPhone());
                userVo1.setuCreatime(user.getuCreatime());
                userVo1.setCsId(user.getCsId());
                userVo1.setuAvaiable(user.getuAvaiable());

                userVo1.setCsName(esClassMapper.selectByPrimaryKey(userVo1.getCsId()).getCsName());

                Integer rId = roleMapper.selectRidByUid(user.getuId());
                if(rId != null){
                    Role role = roleMapper.selectByPrimaryKey(rId);
                    userVo1.setuType(role.getrName());
                }
                userVos.add(userVo1);
            }
        }
        else{
            List<String> uids = roleMapper.selectUidsByRid(roleMapper.selectRidByRname(userVo.getuType())) ;
            System.out.println(uids);
            for(User user : users){
                if(uids.contains(user.getuId())){
                    UserVo userVo1 = new UserVo();

                    userVo1.setuId(user.getuId());
                    userVo1.setuName(user.getuName());
                    userVo1.setuSex(user.getuSex());
                    userVo1.setuPwd(user.getuPwd());
                    userVo1.setuPhone(user.getuPhone());
                    userVo1.setuCreatime(user.getuCreatime());
                    userVo1.setCsId(user.getCsId());
                    userVo1.setuAvaiable(user.getuAvaiable());

                    userVo1.setCsName(esClassMapper.selectByPrimaryKey(userVo1.getCsId()).getCsName());

                    Integer rId = roleMapper.selectRidByUid(user.getuId());
                    if(rId != null){
                        Role role = roleMapper.selectByPrimaryKey(rId);
                        userVo1.setuType(role.getrName());
                    }
                    userVos.add(userVo1);
                }
            }
        }
        return userVos;
    }

    @Override
    public UserVo login(UserVo userVo) {
        userVo.setuPwd(DigestUtils.md5DigestAsHex(userVo.getuPwd().getBytes()));
        User user = userMapper.login(userVo);
        if(null!=user){
            UserVo userVo1 = new UserVo();

            userVo1.setuId(user.getuId());
            userVo1.setuName(user.getuName());
            userVo1.setuSex(user.getuSex());
            userVo1.setuPwd(user.getuPwd());
            userVo1.setuPhone(user.getuPhone());
            userVo1.setuCreatime(user.getuCreatime());
            userVo1.setCsId(user.getCsId());
            userVo1.setuAvaiable(user.getuAvaiable());

            userVo1.setCsName(esClassMapper.selectByPrimaryKey(userVo1.getCsId()).getCsName());
            Integer rId = roleMapper.selectRidByUid(userVo1.getuId());
            if(rId != null){
                Role role = roleMapper.selectByPrimaryKey(rId);
                userVo1.setuType(role.getrName());
            }
            return userVo1;
        }
        else{
            return null;
        }
    }

    @Override
    public int updatePwd(UserVo userVo) {
        userVo.setuPwd(DigestUtils.md5DigestAsHex(userVo.getuPwd().getBytes()));
        return userMapper.updateByPrimaryKeySelective(userVo);
    }
}
