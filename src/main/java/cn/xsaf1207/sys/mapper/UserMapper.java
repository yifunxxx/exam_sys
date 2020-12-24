package cn.xsaf1207.sys.mapper;

import cn.xsaf1207.sys.domain.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int deleteuserScore(String uId);

    int deleteuserRole(String uId);

    List<User> selectAllUser();

}