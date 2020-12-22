package cn.xsaf1207.sys.mapper;

import cn.xsaf1207.sys.domain.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer muId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer muId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}