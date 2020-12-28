package cn.xsaf1207.sys.service;

import cn.xsaf1207.sys.vo.RoleVo;
import cn.xsaf1207.sys.vo.UserVo;

import java.util.List;

public interface RoleService {
    List<RoleVo> queryAllRole(UserVo userVo);
}
