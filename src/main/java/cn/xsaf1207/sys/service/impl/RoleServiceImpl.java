package cn.xsaf1207.sys.service.impl;

import cn.xsaf1207.sys.domain.Role;
import cn.xsaf1207.sys.mapper.RoleMapper;
import cn.xsaf1207.sys.mapper.UserMapper;
import cn.xsaf1207.sys.service.RoleService;
import cn.xsaf1207.sys.vo.RoleVo;
import cn.xsaf1207.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<RoleVo> queryAllRole(UserVo userVo) {
        List<Role> roles = roleMapper.selectAllRole();
        List<RoleVo> roleVos = new ArrayList<>();
        Integer rId = -1;
        if(userVo != null && userVo.getuId() != null){
            rId = userMapper.selectRidByUid(userVo.getuId());
        }
        for(Role role : roles){
            RoleVo roleVo = new RoleVo();

            roleVo.setrId(role.getrId());
            roleVo.setrName(role.getrName());
            roleVo.setrDesc(role.getrDesc());
            roleVo.setrAvaiable(role.getrAvaiable());

            if(role.getrId() == rId){
                roleVo.setSelected(1);
            }
            roleVos.add(roleVo);
        }
        return roleVos;
    }
}
