package cn.xsaf1207.sys.mapper;

import cn.xsaf1207.sys.domain.Role;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    Integer selectRidByUid(String uId);

    List<Role> selectAllRole();
}